package ScalaBasics.part1

object StringHandling extends App{

  val str: String = "Hello, I am learning Scala";

  //standard String operations
  //returns the character at the given index
  println(str.charAt(2))
  //returns the string from the beginning index to the last index
  println(str.substring(7,11))
  //returns the string from the first index
  println(str.substring(5))
  //splits the string into multiple pieces depending upon the delimiter
  println(str.split(" ").toList)
  //it returns true and false depending upon whether the original String starts with the parameter String
  println(str.startsWith("Hello"))
  //replace " " with "-" for the given String
  println(str.replace(" ","-"))
  //it turns every letter into small caps
  println(str.toLowerCase())
  //it turns every letter into upper caps
  println(str.toUpperCase())
  //it returns the length of a given String
  println(str.length)

  //Scala provides its own utilities
  //it can automatically converts a String into a Number
  val aNumberString = "45"
  val aNumber = aNumberString.toInt
  println(aNumber)

  //Prepending and appending
  println('a' +: aNumberString :+ 'z')

  //reversing of a given String
  println(str.reverse)
  //returns the parameter characters from the String
  println(str.take(2))

  //Scala-specific: String interpolators
  /*
    1. S-interpolators
    2. F-interpolators
    3. raw-interpolators
   */
  //S-interpolators
  val name = "Sumit"
  val age = 33
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age +1} years old"
  println(greeting)
  println(anotherGreeting)

  //F-interpolators
  val speed = 1.2f
  val myth = f"$name can run $speed%2.2f kms per minute"
  println(myth)

  //check for the type correctness
  //it will throw exception at runtime
  /*
  type mismatch;
 found   : Float
 required: Int, Long, Byte, Short, BigInt
  val str1 = f"$x%3d"

  val x = 1.1f
  val str1 = f"$x%3d"
  println(str1)*/

  //raw-interpolators
  println(raw"This is a \n newline")
  val escaped = "This is a \n newline"
  println(raw"$escaped")

}
