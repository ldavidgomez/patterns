package abstractFactory.Pizzas

import abstractFactory.Ingredients._

/**
  * Created by david on 8/08/16.
  */
abstract class Pizza {
  var name: String = _
  var dough: Dough = _
  var sauce: Sauce = _
  var veggies: Array[Veggies] = _
  var cheese: Cheese = _
  var pepperoni: Pepperoni = _
  var clam: Clams = _

  def prepare

  def bake = println("Bake for 25 minutes at 350")

  def cut = println("Cutting the pizza into diagonal slices")

  def box = println("Place pizza in official PizzaStore box")

  def getName: String = name
  def setName(name: String) = this.name = name

  override def toString = "Pizza " + this.name
}
