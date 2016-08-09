package command

/**
  * Created by david on 9/08/16.
  */
class SimpleRemoteControl {
  var slot: Command = _

  def setCommand(command: Command): Unit = slot = command

  def buttonWasPressed = slot.execute
}
