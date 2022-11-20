package ScalaBasics.part1

object DefaultArgs extends App{

  def tailRecursiveFactorial(n: Int, acc: Int = 1): Int =
    if(n <= 1) acc
    else tailRecursiveFactorial(n - 1, n * acc)

  val fact10 = tailRecursiveFactorial(10)
  println(fact10)

  def savePicture(format: String, width: Int = 1920, height: Int = 1080) = println("Saving Picture")
  savePicture("bmp")

  /*
    1. Pass in every leading argument
    2. Name the arguments

   */
}
