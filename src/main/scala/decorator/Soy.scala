package decorator

/**
  * Created by david on 7/08/16.
  */
class Soy(b: Beverage) extends CondimentDecorator {
  val beverage: Beverage = b

  override def getDescription(): String = beverage.getDescription() + ", Soy"

  override def cost: Double = 0.30 + beverage.cost
}
