package strategy

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by david on 6/08/16.
  */
@RunWith(classOf[JUnitRunner])
class StrategySuite extends FunSuite {


  test("duck has fly behavior") {
    val flyBehavior: FlyBehavior = new FlyWithWings
    val quackBehavior: QuackBehavior = new Quack
    val duck = new ModelDuck(flyBehavior, quackBehavior)
//    assert(duck.performFly != Nil)
    assert(duck.flyBehavior.equals(flyBehavior))
  }

  test("duck has quack behavior") {
    val flyBehavior: FlyBehavior = new FlyWithWings
    val quackBehavior: QuackBehavior = new Quack
    val duck = new ModelDuck(flyBehavior, quackBehavior)
    assert(duck.quackBehavior.equals(quackBehavior))
  }

}
