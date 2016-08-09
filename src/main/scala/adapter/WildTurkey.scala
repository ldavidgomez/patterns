package adapter

/**
  * Created by david on 9/08/16.
  */
class WildTurkey extends Turkey {
  override def gobble: Unit = println("Gobble gobble")

  override def fly: Unit = println("I'm flying a short distance")
}
