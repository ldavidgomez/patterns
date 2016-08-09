package command.Commands

import command.CeilingFan

/**
  * Created by david on 9/08/16.
  */
class CeilingFanMediumCommand(c: CeilingFan) extends Command {
  val ceilingFan: CeilingFan = c
  var prevSpeed: Int = _

  override def execute: Unit = {
    prevSpeed = ceilingFan.getSpeed
    ceilingFan.medium
  }

  //DRY!!!
  override def undo: Unit = prevSpeed match {
    case CeilingFan.HIGH => ceilingFan.high
    case CeilingFan.MEDIUM => ceilingFan.medium
    case CeilingFan.LOW => ceilingFan.low
    case CeilingFan.OFF => ceilingFan.off
  }
}
