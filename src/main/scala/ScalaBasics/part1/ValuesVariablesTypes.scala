package ScalaBasics.part1

object ValuesVariablesTypes extends App{
  val x = 42
  println(x)

  //"val" are immutable
  //x =11;


  val xx: Int = 23
  val aString: String = "Learning, Scala"
  val aShort: Short =  23214
  val aFloat: Float = 232.12f
  val aLong: Long = 21324214l
  val aDouble: Double = 13213.12

  //"var" are mutable
  var aVariable: Int = 99
  aVariable = 11 // as its mutable

  //multiple expressions can be done by using semicolon if we need to write in one line
  val aa: Short =  23214; val bb: Double = 13213.12
  //correct way
  val ac: Long = 21324214l
  val as: Double = 13213.12


}
