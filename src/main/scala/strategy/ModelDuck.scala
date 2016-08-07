package strategy

/**
  * Created by david on 6/08/16.
  */
class ModelDuck(fly: FlyBehavior, quack: QuackBehavior) extends Duck {

  override def display(): Unit = println("I'm a model duck")

  override var flyBehavior: FlyBehavior = fly
  override var quackBehavior: QuackBehavior = quack
}
