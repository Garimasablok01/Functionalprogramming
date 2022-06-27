package Functionalprogramming

object example2 {
  def main(args: Array[String]): Unit = {
    println("increment value"+increment(5))
    printmessage()
    println("addition od number"+addition(2,3))
  }
   var increment=(x:Int)=> x+1                                  //increment of number using AF
   var printmessage =()=> println("this is example 2")         //print msg using anonymous function

  //anonymous function with 2 input perameters and 1 output parameters
  var addition=(x:Int,y:Int)=>x+y                                   //addiion using AF
}
