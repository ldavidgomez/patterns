package factory

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

  protected abstract def createPizza(pizzaType: String): Pizza
}
