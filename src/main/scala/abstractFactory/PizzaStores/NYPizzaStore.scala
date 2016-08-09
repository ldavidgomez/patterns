package abstractFactory.PizzaStores

import abstractFactory.Ingredients.{NYPizzaIngredientFactory, PizzaIngredientsFactory}
import abstractFactory.Pizzas.{CheesePizza, ClamPizza, Pizza}

/**
  * Created by david on 8/08/16.
  */
class NYPizzaStore extends PizzaStore {
  override def createPizza(item: String): Pizza = {
    var pizza: Pizza = null.asInstanceOf[Pizza]
    val ingredientFactory: PizzaIngredientsFactory = new NYPizzaIngredientFactory

    item match {
      case "cheese" => {
        pizza = new CheesePizza(ingredientFactory)
        pizza.setName("NY Cheese Pizza")
      }
      case "clam" => {
        pizza = new ClamPizza(ingredientFactory)
        pizza.setName("NY Clam Pizza")
      }
    }
    pizza
  }
}
