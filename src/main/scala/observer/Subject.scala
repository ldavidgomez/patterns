package observer

/**
  * Created by david on 7/08/16.
  */
trait Subject {
  def registerObserver(observer: Observer)
  def removeObserver(observer: Observer)
  def notifyObserver
}
