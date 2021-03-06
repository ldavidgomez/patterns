package abstractFactory.Ingredients

/**
  * Created by david on 8/08/16.
  */
class NYPizzaIngredientFactory extends PizzaIngredientsFactory{
  override def createDough: Dough = new ThinCrustDough

  override def createCheese: Cheese = new MozzarellaCheese

  override def createVeggies: Array[Veggies] = Array(new Garlic, new Onion)

  override def createPepperoni: Pepperoni = new SlicedPepperoni

  override def createSauce: Sauce = new PlumTomatoSauce

  override def createClam: Clams = new FreshClam
}
