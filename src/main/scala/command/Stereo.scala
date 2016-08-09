package command

/**
  * Created by david on 9/08/16.
  */
class Stereo {
  var state: String = _
  var cd: String = _
  var volume: Int = _

  def on = {
    state = "on"
    println("Stereo on")
  }
  def off = {
    state = "off"
    println("Stereo off")
  }
  def setCD = {
    cd = "in"
    println("CD set")
  }
  def setVolume(vol: Int) = {
    volume = vol
    println("Volume = " + volume)
  }
}
