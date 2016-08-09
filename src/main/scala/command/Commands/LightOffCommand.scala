package command.Commands

import command.Light

/**
  * Created by david on 9/08/16.
  */
class LightOffCommand(l: Light) extends Command {
  val light: Light = l

  override def execute: Unit = light.off

  override def undo: Unit = light.on
}
