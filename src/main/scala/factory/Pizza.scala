package factory

import java.util

import scala.collection.JavaConverters._

/**
  * Created by david on 8/08/16.
  */
abstract class Pizza {
  var name: String
  var dough: String
  var sauce: String
  var topping: util.ArrayList[String] = new util.ArrayList[String]()

  def prepare = {
    println()
    println("Preparing " + name)
    println("Adding dough" + dough)
    println("Adding sauce..." + sauce)
    println("Adding toppings: ")
    for(t <- topping.asScala) println(t)

    println()
  }

  def bake = println("Bake for 25 minutes at 350")

  def cut = println("Cutting the piza into diagonal slices")

  def box = println("Place pizza in official PizzaStore box")

  def getName: String = name
}
