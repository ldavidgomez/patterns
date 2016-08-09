package command.Commands

/**
  * Created by david on 9/08/16.
  */
trait Command {
  def execute: Unit
  def undo: Unit
}
