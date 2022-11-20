package ScalaBasics.part1

object Functions extends App{

  def aFunction(a: String, b: Int): String = {
    a + " " +b
  }

  println(aFunction("hello" , 10))

  def aParameterLessFunction(): Int = 42
  println(aParameterLessFunction)

  //recursive function
  def aRecursiveCall(str: String, x: Int): String = {
    if(x == 1) str
    else str + aRecursiveCall(str, x -1)
  }

  println(aRecursiveCall("hello", 10))

  def aFunctionWithSideEffects(str: String): Unit = println(str)

  /*Exercises
    1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old"
    2. A recursive function of a factorial 1 * 2 * 3 * .. n
    3. A recursive Fibonacci function
            f(1) = 1
            f(2) = 2
            f(n) = f(n-1) + f(n-2)
     4. Tests if a number is prime
   */

  //1. A greeting function (name, age) => "Hi, my name is $name and I am $age years old"
  def greeting(name: String, age: Int): String = {
    "Hi, my name is " +name+ " and I am " +age+ " years old"
  }
  println(greeting("Sumit", 33))


  //2. A recursive function of a factorial 1 * 2 * 3 * .. n
  def factorial(n: Int): Int = {
    if(n == 0) 1
    else n * factorial(n - 1)
  }
  println(factorial(6))

  /*3. A recursive Fibonacci function
  f(1) = 1
  f(2) = 2
  f(n) = f(n-1) + f(n-2)*/
  def fibonacci(n: Int):Int = {
    if(n < 3) 1
    else fibonacci(n - 1) + fibonacci(n -2)
  }
  println(fibonacci(10))

  //4. Tests if a number is prime
  def isPrime(number: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if(t <= 1) true
      else number % t !=0 && isPrimeUntil(t-1)

    isPrimeUntil(number/2)
  }

  println(isPrime(37))
  println(isPrime(321341234))
  println(isPrime(20*67))

}

