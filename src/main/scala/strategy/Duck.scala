package strategy

/**
  * Created by david on 6/08/16.
  */
abstract class Duck {
  var flyBehavior: FlyBehavior
  var quackBehavior: QuackBehavior

  def display()

  def performFly = {
    flyBehavior.fly
  }

  def performQuack = {
    quackBehavior.quack
  }

  def setFlyBehavior(fly: FlyBehavior): Unit = {
    this.flyBehavior = fly
  }

  def setQuackBehavior(quack: QuackBehavior): Unit = {
    this.quackBehavior = quack
  }
}
