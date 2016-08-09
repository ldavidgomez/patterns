package factory

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by david on 7/08/16.
  */
@RunWith(classOf[JUnitRunner])
class FactorySuit extends FunSuite {

  test("order chicago cheese pizza") {
    val chicagoStore: PizzaStore = new ChicagoPizzaStore
    val chicagoCheesePizza: Pizza = chicagoStore.orderPizza("cheese")
    assert(chicagoCheesePizza.isInstanceOf[ChicagoStyleCheesePizza].equals(true))
  }

  test("order ny cheese pizza") {
    val nyStore: PizzaStore = new NYPizzaStore
    val nyCheesePizza: Pizza = nyStore.orderPizza("cheese")
    assert(nyCheesePizza.isInstanceOf[NYStyleCheesePizza].equals(true))
  }

//  test("make a House Blend with Mocha and a Whip") {
//    var beverage: Beverage = new HouseBlend
//    beverage = new Mocha(beverage)
//    beverage = new Whip(beverage)
//    assert(beverage.getDescription.equals("House Blend Coffee, Mocha, Whip"))
//  }
//
//  test("get cost of a simple Espresso") {
//    val beverage: Beverage = new Espresso
//    assert(beverage.cost.equals(1.99))
//  }
//
//  test("get cost of a House Blend with Mocha and a Whip") {
//    var beverage: Beverage = new HouseBlend
//    beverage = new Mocha(beverage)
//    beverage = new Whip(beverage)
//    assert(beverage.cost.equals(1.59))
//  }
}
