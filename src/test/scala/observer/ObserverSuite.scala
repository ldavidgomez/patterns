package observer

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by david on 7/08/16.
  */
@RunWith(classOf[JUnitRunner])
class ObserverSuite extends FunSuite {

  test("register observer") {
    val weatherData: WeatherData = new WeatherData
    val currentConditionsDisplay: CurrentConditionsDisplay = new CurrentConditionsDisplay(weatherData)

    assert(weatherData.size() == 1)
  }

  test("unregister observer") {
    val weatherData: WeatherData = new WeatherData
    val currentConditionsDisplay: CurrentConditionsDisplay = new CurrentConditionsDisplay(weatherData)

    weatherData.removeObserver(currentConditionsDisplay)

    assert(weatherData.size() == 0)
  }

  test("set measurements") {
    val weatherData: WeatherData = new WeatherData
    val currentConditionsDisplay: CurrentConditionsDisplay = new CurrentConditionsDisplay(weatherData)

    weatherData.setMeasurements(24, 65, 30.4f)
    assert((currentConditionsDisplay.temperature == 24) && (currentConditionsDisplay.humidity == 65))
  }
}
