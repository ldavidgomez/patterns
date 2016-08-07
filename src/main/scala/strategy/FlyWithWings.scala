package strategy

/**
  * Created by david on 6/08/16.
  */
class FlyWithWings extends FlyBehavior{
  override def fly: Unit = println("I'm flying with my wings!")
}
