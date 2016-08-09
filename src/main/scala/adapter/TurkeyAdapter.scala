package adapter

/**
  * Created by david on 9/08/16.
  */
class TurkeyAdapter(t: Turkey) extends Duck{
  val turkey: Turkey = t

  override def quack: Unit = turkey.gobble

  override def fly: Unit = for(i <- 1 to 5) println(turkey.fly)
}
