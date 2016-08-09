package command

/**
  * Created by david on 9/08/16.
  */
class CeilingFan(l: String) {
  var location: String = l
  var speed: Int = CeilingFan.OFF

  def high = speed = CeilingFan.HIGH
  def medium = speed = CeilingFan.MEDIUM
  def low = speed = CeilingFan.LOW
  def off = speed = CeilingFan.OFF

  def getSpeed: Int = speed

}

object  CeilingFan {
  val HIGH: Int = 3
  val MEDIUM: Int = 2
  val LOW: Int = 1
  val OFF: Int = 0
}
