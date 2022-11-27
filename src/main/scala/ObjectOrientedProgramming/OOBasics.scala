package ObjectOrientedProgramming


object OOBasics extends App {

  val person = new Person("Sumit", 33)
  println(person.age)
  println(person.x)
  println(person.greeting("Sumit"))

  val author = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel("Great Expectations", 1861, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new Counter
  counter.incr.print
  counter.increment(10).print



//constructor
class Person(name: String, val age: Int) {
  //body i.e. defines the implementation of the class
  val x = 10
  println(1 + 11)

  def greeting(name: String): Unit = println(s"$name says: Hi, $name")

  //multiple constructors
  def this(name: String) = this(name, 0)
}
  /*
  Exercises on Object-oriented Basics
  1. Novel and a writer

  Writer: first name, surname, year of birth
      - method fullname

  Novel: name, year of release , author(which is an instance of Writer)
      - method
          - authorAge - returns the age of an author at the year of release
          - isWrittenBy(author) -
          - copy( new year of release) = new instance of Novel with a new year of release

  */

  class Writer(firstName: String, surname: String, val year: Int){
    def fullName: String = firstName+ " " + surname
  }

  class Novel(name: String, year: Int, author: Writer){
    def authorAge = year - author.year
    def isWrittenBy(author: Writer) = author == this.author
    def copy(newYear: Int): Novel = new Novel(name, newYear, author)
  }

  /*
   2. Counter class
         - receives an int value
         - method current count
         - method to increment/decrement => new Counter
         - method overload inc/dec to receive a parameter "amount"

   */
  class Counter(val count: Int = 0){
    def incr = {
      println("Incrementing")
      new Counter(count + 1)
    }
    def decr = {
      println("Decrementing")
      new Counter(count - 1)
    }

    //overloaded methods
    //Recursive version of increment method
    def increment(n: Int): Counter = {
      if(n <= 0) this
      else incr.increment(n - 1)
    }

    def decrement(n: Int): Counter = {
      if(n <= 0) this
      else decr.decrement(n - 1)
    }

    def print = println(count)

  }

}