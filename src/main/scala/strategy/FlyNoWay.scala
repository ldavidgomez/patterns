package strategy

/**
  * Created by david on 6/08/16.
  */
class FlyNoWay extends FlyBehavior {
  override def fly: Unit = println("I can't fly!")
}
