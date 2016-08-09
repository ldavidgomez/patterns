package adapter

/**
  * Created by david on 9/08/16.
  */
class MallardDuck extends Duck {
  override def quack: Unit = println("Quack!")

  override def fly: Unit = println("I'm flying")
}
