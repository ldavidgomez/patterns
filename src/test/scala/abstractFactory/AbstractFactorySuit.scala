package abstractFactory

import abstractFactory.PizzaStores.{ChicagoPizzaStore, NYPizzaStore, PizzaStore}
import abstractFactory.Pizzas.{CheesePizza, ClamPizza, Pizza}
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by david on 7/08/16.
  */
@RunWith(classOf[JUnitRunner])
class AbstractFactorySuit extends FunSuite {

  test("order chicago cheese pizza") {
    val chicagoStore: PizzaStore = new ChicagoPizzaStore
    val cheesePizza: Pizza = chicagoStore.orderPizza("cheese")
    assert(cheesePizza.isInstanceOf[CheesePizza].equals(true))
  }

  test("order ny clam pizza") {
    val nyStore: PizzaStore = new NYPizzaStore
    val clamPizza: Pizza = nyStore.orderPizza("clam")
    assert(clamPizza.isInstanceOf[ClamPizza].equals(true))
  }
}
