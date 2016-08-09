package factory

/**
  * Created by david on 8/08/16.
  */
class NYPizzaStore extends PizzaStore {
  override def createPizza(pizzaType: String): Pizza = pizzaType match {
    case "cheese" => new NYStyleCheesePizza
  }
}
