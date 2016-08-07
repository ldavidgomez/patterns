package observer

import java.util

import scala.collection.JavaConverters._

/**
  * Created by david on 7/08/16.
  */
class WeatherData extends Subject {
  private val observers: util.ArrayList[Observer] = new util.ArrayList[Observer]()
  private var temperature: Float = _
  private var humidity: Float = _
  private var pressure: Float = _

  override def registerObserver(observer: Observer): Unit = observers.add(observer)

  override def removeObserver(observer: Observer): Unit = {
    val index = observers.indexOf(observer)
    if (index >= 0) observers.remove(index)
  }

  override def notifyObserver: Unit = {
    for(observer: Observer <- observers.asScala) observer.update(temperature, humidity, pressure)
  }

  def measurementsChanged = {
    notifyObserver
  }

  def setMeasurements(temperature: Float, humidity: Float, pressure: Float) = {
    this.temperature = temperature
    this.humidity = humidity
    this.pressure = pressure
    measurementsChanged
  }

  def size(): Int = {
    return this.observers.size()
  }
}
