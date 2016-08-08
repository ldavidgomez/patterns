package factory

/**
  * Created by david on 8/08/16.
  */
class ChicagoStyleCheesePizza extends Pizza {
  override var name: String = "Chicago Style Deep Dish Cheese Pizza"
  override var sauce: String = "Extra Thick Crust Dough"
  override var dough: String = "Plum Tomato Sauce"

  def this() = {
    this()
    topping.add("Shredded Mozzarella Cheese")
  }

  override def cut = {
    println("Cutting the pizza into square slices")
  }
}
