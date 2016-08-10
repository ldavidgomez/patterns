package templateMethod

/**
  * Created by david on 10/08/16.
  */
abstract class CaffeineBeverage {
  final def prepareRecipe: Unit = {
    boilWater
    brew
    pourInCup
    addCondiments
  }

  def brew
  def addCondiments

  def boilWater = println("Boiling water")
  def pourInCup = println("Pouring into cup")
}
