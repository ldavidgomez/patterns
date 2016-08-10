package templateMethod

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by david on 6/08/16.
  */
@RunWith(classOf[JUnitRunner])
class TemplateMethodSuite extends FunSuite {

  //TODO
  //No sense test
  test("make some tea") {
    val tea: Tea = new Tea
    tea.prepareRecipe

    assert(!tea.equals(Nil))
  }

  //TODO
  //No sense test
  test("make some coffee") {
    val coffee: Coffee = new Coffee
    coffee.prepareRecipe

    assert(!coffee.equals(Nil))
  }


}
