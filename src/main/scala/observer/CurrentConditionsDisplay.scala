package observer

/**
  * Created by david on 7/08/16.
  */
class CurrentConditionsDisplay() extends Observer with DisplayElement {
  var temperature: Float = _
  var humidity: Float = _
  var weatherData: Subject = _

  def this(subject: Subject) = {
    this()
    this.weatherData = subject
    this.weatherData.registerObserver(this)
  }

  override def update(temperature: Float, humidity: Float, pressure: Float): Unit = {
    this.temperature = temperature
    this.humidity = humidity
    display
  }

  override def display: Unit = {
    println("Current conditions: " + temperature + " Cº and " + humidity + "% humidity")
  }
}
