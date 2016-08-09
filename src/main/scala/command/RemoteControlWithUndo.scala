package command

import command.Commands.{Command, NoCommand}

/**
  * Created by david on 9/08/16.
  */
class RemoteControlWithUndo {
  val noCommand: NoCommand = new NoCommand
  var undoCommand: Command = noCommand
  var onCommands: Array[Command] = Array.fill[Command](7)(noCommand)
  var offCommands: Array[Command]  = Array.fill[Command](7)(noCommand)

  def setCommand(slot: Int, onCommand: Command, offCommand: Command): Unit = {
    onCommands.update(slot, onCommand)
    offCommands.update(slot, offCommand)
  }

  def onButtonWasPushed(slot: Int) = {
    onCommands(slot).execute
    undoCommand = onCommands(slot)
  }
  def offButtonWasPushed(slot: Int) = {
    offCommands(slot).execute
    undoCommand = offCommands(slot)
  }

  def undoButtonWasPushed = {
    undoCommand.undo
  }

  override def toString: String = {
    val sb: StringBuffer = new StringBuffer()
    sb.append("\n----- Remote Control -----\n")
    for((command,i) <- onCommands.view.zipWithIndex) {
      sb.append("[slot " + i + "]" + command.getClass.getName + " " + offCommands(i).getClass.getName + "\n")
    }

    sb.toString
  }
}