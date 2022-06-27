package Functionalprogramming

object example1 {
  def main(args: Array[String]): Unit = {
    printstatement()                                //normal print statement defining a function
    var fact=factorial(8)
    println(fact)
  }

     def printstatement()={
       println("Functional programming example 1")
     }

    def factorial (x:Int):Int={                     //factorial program
      if (x<=1){
        1
      }
      else{
        x * factorial(x-1)
      }
    }
}