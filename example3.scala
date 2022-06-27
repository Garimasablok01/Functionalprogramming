package Functionalprogramming

object example3 {
  def main(args: Array[String]): Unit = {
    var list=List(1,2,3,4,5,6,7,8,9)                  //check the no division

    println("/////////////////////////////square of a number///////////////////////////////////////")

    var squareoutput=list.map(square)
    println(squareoutput)

    println("///////////////////////////check no is divible bt 3 or not///////////////////////////////////")

    var output= list.filter((x:Int)=>x%3==0)
    output.foreach(x=>println(x+"divisible by 3"))

    println("/////////////////////////////another way to do the same///////////////////////////////////")

    list.foreach(num=>
    if(division(num))
    println( num +"divisible of 3")
    else
    {
      println( num +" not divisible by 3")
    })
  }
  var division=(x:Int)=>x%3==0                            //using Anonymous function


  var square=(x:Int)=>x*2                                //square of number using AF
}
