package command

/**
  * Created by david on 9/08/16.
  */
class LightOnCommand(l: Light) extends Command {
  val light: Light = l

  override def execute: Unit = light.on
}
