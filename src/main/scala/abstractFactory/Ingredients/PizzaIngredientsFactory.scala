package abstractFactory.Ingredients

/**
  * Created by david on 8/08/16.
  */
trait PizzaIngredientsFactory {
  def createDough: Dough
  def createSauce: Sauce
  def createCheese: Cheese
  def createVeggies: Array[Veggies]
  def createPepperoni: Pepperoni
  def createClam: Clams
}
