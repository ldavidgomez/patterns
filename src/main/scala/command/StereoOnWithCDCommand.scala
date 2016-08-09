package command

import scala.collection.concurrent.RDCSS_Descriptor

/**
  * Created by david on 9/08/16.
  */
class StereoOnWithCDCommand(s: Stereo) extends Command {
  var stereo: Stereo = s

  override def execute: Unit = {
    stereo.on
    stereo.setCD
    stereo.setVolume(11)
  }
}
