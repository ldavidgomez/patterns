package strategy

/**
  * Created by david on 6/08/16.
  */
class Quack extends QuackBehavior {
  override def quack: Unit = println("Quack!")
}
