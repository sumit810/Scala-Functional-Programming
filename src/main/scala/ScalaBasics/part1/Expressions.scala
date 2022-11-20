package ScalaBasics.part1

object Expressions extends App{

  val x = 1 + 2
  println(x)

  var y: Int = 2
  val aWierdValue = (y = 8)
  println(aWierdValue)

  //if expression
  val aCondition = true
  val aConditionValue = if(aCondition) 10 else 20
  println(aConditionValue)

  // 1.
  val someValue = {
    2< 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 1223 else 133
    100
  }
  println(someOtherValue)

}
