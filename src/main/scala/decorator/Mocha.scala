package decorator

/**
  * Created by david on 7/08/16.
  */
class Mocha(b: Beverage) extends CondimentDecorator {
  val beverage: Beverage = b

  override def getDescription(): String = beverage.getDescription() + ", Mocha"

  override def cost: Double = 0.20 + beverage.cost
}
