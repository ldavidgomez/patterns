package adapter

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
  * Created by david on 6/08/16.
  */
@RunWith(classOf[JUnitRunner])
class AdapterSuite extends FunSuite {


  test("adapt Turkey to Duck") {
    val mallardDuck: MallardDuck = new MallardDuck
    val turkey: Turkey = new WildTurkey
    val turkeyAdapter: Duck = new TurkeyAdapter(turkey)

    println("The Turkey says...")
    turkey.gobble
    turkey.fly

    printf("The TurkeyAdapter says...")
    turkeyAdapter.quack
    turkeyAdapter.fly

    assert(mallardDuck.getClass.getInterfaces()(0).eq(turkeyAdapter.getClass.getInterfaces()(0)))
  }

}
