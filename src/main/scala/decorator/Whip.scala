package decorator

/**
  * Created by david on 7/08/16.
  */
class Whip(b: Beverage) extends CondimentDecorator {
  val beverage: Beverage = b

  override def getDescription(): String = beverage.getDescription() + ", Whip"

  override def cost: Double = 0.50 + beverage.cost
}