package decorator

/**
  * Created by david on 7/08/16.
  */
abstract class Beverage {
  val description: String = "Unknown Beverage"

  def getDescription(): String = description

  def cost: Double
}
