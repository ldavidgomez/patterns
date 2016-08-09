package command.Commands

import command.Stereo

/**
  * Created by david on 9/08/16.
  */
class StereoOffCommand(s: Stereo) extends Command {
  var stereo: Stereo = s

  override def execute: Unit = stereo.off

  override def undo: Unit = stereo.on
}
