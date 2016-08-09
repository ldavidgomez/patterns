package abstractFactory.Pizzas

import abstractFactory.Ingredients.PizzaIngredientsFactory

/**
  * Created by david on 8/08/16.
  */
class ClamPizza(ingredientFactory: PizzaIngredientsFactory) extends Pizza {
  val pizzaIngredientFactory: PizzaIngredientsFactory = ingredientFactory

  override def prepare: Unit = {
    println("Preparing " + name)
    dough = ingredientFactory.createDough
    sauce = ingredientFactory.createSauce
    cheese = ingredientFactory.createCheese
    veggies = ingredientFactory.createVeggies
    clam = ingredientFactory.createClam
  }
}
