package abstractFactory.PizzaStores

import abstractFactory.Ingredients.{ChicagoPizzaIngredientFactory, PizzaIngredientsFactory}
import abstractFactory.Pizzas.{ClamPizza, CheesePizza, Pizza}

/**
  * Created by david on 8/08/16.
  */
class ChicagoPizzaStore extends PizzaStore {
  override def createPizza(item: String): Pizza = {
      var pizza: Pizza = null.asInstanceOf[Pizza]
    val ingredientFactory: PizzaIngredientsFactory = new ChicagoPizzaIngredientFactory

    item match {
      case "cheese" => {
        pizza = new CheesePizza(ingredientFactory)
        pizza.setName("Chicago Cheese Pizza")
      }
      case "clam" => {
        pizza = new ClamPizza(ingredientFactory)
        pizza.setName("Chicago Veggies Pizza")
      }
    }
    pizza
  }
}
