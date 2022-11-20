package ScalaBasics.part1

import scala.jdk.Accumulator

object Recursion extends App{

  def factorial(n: Int): Int =
    if(n <= 1) 1
    else{
      println("Computing factorial of " + n +  " - I first need factorial of " + (n - 1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)
      result
    }

  println(factorial(10))


  // By using accumulator recursive approach
  def anotherFactorial(n: Int): BigInt = {
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if(x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)

    factHelper(n, 1)
  }

  println(anotherFactorial(5000))

  /*   DRY RUN
  anotherFactorial(10) = factHelper(10,1)
  = factHelper(10-1, 10 * 1) = factHelper(9,10)
  = factHelper(9-1, 9 * 10 * 1) = factHelper(8, 9 * 10 * 1)
  = factHelper(8-1, 8 * 9 * 10 * 1) = factHelper(7, 8 * 9 * 10 * 1)
  = factHelper(7-1, 7 * 8 * 9 * 10 * 1) = factHelper(6, 7 * 8 * 10 * 1)
  = factHelper(6-1, 6 * 7 * 8 * 9 * 10 * 1) = factHelper(5, 6 * 7 * 8 * 9 * 10 * 1)
  = factHelper(5-1, 5 * 6 * 7 * 8 * 9 * 10 * 1) = factHelper(4, 5 * 6 * 7 * 8 * 9 * 10 * 1)
  = factHelper(4-1, 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1) = factHelper(3, 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
  = factHelper(3-1, 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1) = factHelper(2, 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
  = factHelper(2-1, 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1) = factHelper(1, 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 1)
  or finally, factHelper(1, 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10)  ---- last call
  so, accumulator = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 which is the definition of factorial

   */

  /* ASSIGNMENT ::
  1. Concatenate a String n times
  2. IsPrime() function TAIL - RECURSIVE
  3. Fibonacci() function



   */

}
