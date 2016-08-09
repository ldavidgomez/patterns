package command

import abstractFactory.PizzaStores.{ChicagoPizzaStore, NYPizzaStore, PizzaStore}
import abstractFactory.Pizzas.{CheesePizza, ClamPizza, Pizza}
import command.Commands._
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by david on 7/08/16.
  */
@RunWith(classOf[JUnitRunner])
class CommandSuit extends FunSuite {

  test("Simple command light on") {
    val remote: SimpleRemoteControl = new SimpleRemoteControl
    val light: Light = new Light
    val lightOn: LightOnCommand = new LightOnCommand(light)

    remote.setCommand(lightOn)
    remote.buttonWasPressed
    assert(light.state.eq("on"))
  }

  test("Simple command light off") {
    val remote: SimpleRemoteControl = new SimpleRemoteControl
    val light: Light = new Light
    val lightOff: LightOffCommand = new LightOffCommand(light)

    remote.setCommand(lightOff)
    remote.buttonWasPressed
    assert(light.state.eq("off"))
  }

  test("Command Stereo on") {
    val remote: RemoteControl = new RemoteControl
    val light: Light = new Light
    val stereo: Stereo = new Stereo
    val lightOn: LightOnCommand = new LightOnCommand(light)
    val lightOff: LightOffCommand = new LightOffCommand(light)
    val stereoOn: StereoOnWithCDCommand = new StereoOnWithCDCommand(stereo)
    val stereoOff: StereoOffCommand = new StereoOffCommand(stereo)

    remote.setCommand(0, lightOn, lightOff)
    remote.setCommand(1, stereoOn, stereoOff)
    println(remote)

    remote.onButtonWasPushed(1)

    assert(stereo.state.eq("on"))
  }

  test("Command light on") {
    val remote: RemoteControl = new RemoteControl
    val light: Light = new Light
    val stereo: Stereo = new Stereo
    val lightOn: LightOnCommand = new LightOnCommand(light)
    val lightOff: LightOffCommand = new LightOffCommand(light)
    val stereoOn: StereoOnWithCDCommand = new StereoOnWithCDCommand(stereo)
    val stereoOff: StereoOffCommand = new StereoOffCommand(stereo)

    remote.setCommand(0, lightOn, lightOff)
    remote.setCommand(1, stereoOn, stereoOff)
    println(remote)

    remote.onButtonWasPushed(0)

    assert(light.state.eq("on"))
  }

  test("Command light on undo") {
    val remote: RemoteControlWithUndo = new RemoteControlWithUndo
    val light: Light = new Light
    val stereo: Stereo = new Stereo
    val lightOn: LightOnCommand = new LightOnCommand(light)
    val lightOff: LightOffCommand = new LightOffCommand(light)
    val stereoOn: StereoOnWithCDCommand = new StereoOnWithCDCommand(stereo)
    val stereoOff: StereoOffCommand = new StereoOffCommand(stereo)

    remote.setCommand(0, lightOn, lightOff)
    remote.setCommand(1, stereoOn, stereoOff)
    println(remote)

    remote.onButtonWasPushed(0)
    remote.undoButtonWasPushed

    assert(light.state.eq("off"))
  }

  test("Command fan execute medium velocity") {
    val remote: RemoteControlWithUndo = new RemoteControlWithUndo
    val ceilingFan: CeilingFan = new CeilingFan("Living Room")

    val ceilingFanMediumCommand: CeilingFanMediumCommand= new CeilingFanMediumCommand(ceilingFan)
    val ceilingFanHighCommand: CeilingFanHighCommand= new CeilingFanHighCommand(ceilingFan)
    val ceilingFanOffCommand: CeilingFanOffCommand= new CeilingFanOffCommand(ceilingFan)

    remote.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand)
    remote.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand)
    println(remote)

    remote.onButtonWasPushed(0)

    assert(ceilingFan.speed == CeilingFan.MEDIUM)
  }

  test("Command fan execute medium velocity undo") {
    val remote: RemoteControlWithUndo = new RemoteControlWithUndo
    val ceilingFan: CeilingFan = new CeilingFan("Living Room")

    val ceilingFanMediumCommand: CeilingFanMediumCommand= new CeilingFanMediumCommand(ceilingFan)
    val ceilingFanHighCommand: CeilingFanHighCommand= new CeilingFanHighCommand(ceilingFan)
    val ceilingFanOffCommand: CeilingFanOffCommand= new CeilingFanOffCommand(ceilingFan)

    remote.setCommand(0, ceilingFanMediumCommand, ceilingFanOffCommand)
    remote.setCommand(1, ceilingFanHighCommand, ceilingFanOffCommand)
    println(remote)

    remote.onButtonWasPushed(0)
    remote.onButtonWasPushed(1)
    remote.undoButtonWasPushed

    assert(ceilingFan.speed == CeilingFan.MEDIUM)
  }

  test("Macro Command test some commands") {
    val remote: RemoteControlWithUndo = new RemoteControlWithUndo

    val light: Light = new Light
    val stereo: Stereo = new Stereo
    val lightOn: LightOnCommand = new LightOnCommand(light)
    val lightOff: LightOffCommand = new LightOffCommand(light)
    val stereoOn: StereoOnWithCDCommand = new StereoOnWithCDCommand(stereo)
    val stereoOff: StereoOffCommand = new StereoOffCommand(stereo)

    val partyOn: Array[Command] = Array(lightOn, stereoOn)
    val partyOff: Array[Command] = Array(lightOff, stereoOff)

    val partyOnMacro: MacroCommand = new MacroCommand(partyOn)
    val partyOffMacro: MacroCommand = new MacroCommand(partyOff)

    remote.setCommand(0, partyOnMacro, partyOffMacro)

    println(remote)

    remote.onButtonWasPushed(0)

    assert(partyOnMacro.commands.length == 2)
  }
}
