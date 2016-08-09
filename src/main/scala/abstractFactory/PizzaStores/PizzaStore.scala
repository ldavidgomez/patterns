package abstractFactory.PizzaStores

import abstractFactory.Pizzas.Pizza

/**
  * Created by david on 8/08/16.
  */
abstract class PizzaStore {

  def orderPizza(pizzaType: String): Pizza = {
    val pizza: Pizza = createPizza(pizzaType)

    pizza.prepare
    pizza.bake
    pizza.cut
    pizza.box

    pizza
  }

  protected def createPizza(pizzaType: String): Pizza
}
