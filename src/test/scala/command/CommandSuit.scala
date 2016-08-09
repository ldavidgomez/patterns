package command

import abstractFactory.PizzaStores.{ChicagoPizzaStore, NYPizzaStore, PizzaStore}
import abstractFactory.Pizzas.{CheesePizza, ClamPizza, Pizza}
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

//  test("Command Stereo on") {
//    val remote: SimpleRemoteControl = new SimpleRemoteControl
//    val light: Light = new Light
//    val lightOn: LightOnCommand = new LightOnCommand(light)
//
//    remote.setCommand(lightOn)
//    remote.buttonWasPressed
//    assert(light.state.eq("on"))
//  }
//
//  test("Simple command light off") {
//    val remote: SimpleRemoteControl = new SimpleRemoteControl
//    val light: Light = new Light
//    val lightOff: LightOffCommand = new LightOffCommand(light)
//
//    remote.setCommand(lightOff)
//    remote.buttonWasPressed
//    assert(light.state.eq("off"))
//  }
}
