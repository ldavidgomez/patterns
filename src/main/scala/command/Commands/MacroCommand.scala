package command.Commands

/**
  * Created by david on 9/08/16.
  */
class MacroCommand(cs: Array[Command]) extends Command {
  val commands: Array[Command] = cs
  override def execute: Unit = {
    commands.foreach(command => command.execute)
  }

  override def undo: Unit = {}
}
