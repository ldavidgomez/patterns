package command

/**
  * Created by david on 9/08/16.
  */
class Light {
  var state: String = _
  def on = {
    state = "on"
    println("Light on")
  }
  def off = {
    state = "off"
    println("Light off")
  }
}
