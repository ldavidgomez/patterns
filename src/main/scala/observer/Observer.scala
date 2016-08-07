package observer

/**
  * Created by david on 7/08/16.
  */
trait Observer {
  def update(temperature: Float, humidity: Float, pressure: Float)
}
