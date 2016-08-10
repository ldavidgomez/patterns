package templateMethod

/**
  * Created by david on 10/08/16.
  */
class Tea extends CaffeineBeverage {
  override def brew: Unit = println("Steeping the tea")

  override def addCondiments: Unit = println("Adding lemon")
}
