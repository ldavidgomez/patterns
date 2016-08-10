package templateMethod

/**
  * Created by david on 10/08/16.
  */
class Coffee extends CaffeineBeverage {
  override def brew: Unit = println("Dripping coffee through filter")

  override def addCondiments: Unit = println("Adding sugar and milk")
}
