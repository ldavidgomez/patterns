package strategy

/**
  * Created by david on 6/08/16.
  */
class MuteQuack extends QuackBehavior {
  override def quack: Unit = println("<<Silence>>")
}
