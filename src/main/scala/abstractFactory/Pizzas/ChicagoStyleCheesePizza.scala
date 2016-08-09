//package abstractFactory.Pizzas
//
//import abstractFactory.Ingredients.{ChicagoPizzaIngredientFactory, PizzaIngredientsFactory}
//
///**
//  * Created by david on 8/08/16.
//  */
//class ChicagoStyleCheesePizza extends Pizza {
//  var pizza: Pizza = _
//  val ingredientFactory: PizzaIngredientsFactory = new ChicagoPizzaIngredientFactory
//
//  override var name: String = "Chicago Style Deep Dish Cheese Pizza"
//  override var sauce: String = "Extra Thick Crust Dough"
//  override var dough: String = "Plum Tomato Sauce"
//
//  val index = {
//    topping.add("Shredded Mozzarella Cheese")
//  }
//
//  override def cut = {
//    println("Cutting the pizza into square slices")
//  }
//}
