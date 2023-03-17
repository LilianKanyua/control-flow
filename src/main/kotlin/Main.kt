fun main(){
   numbers(1..100)
    serve(4)
    serve(12)
    serve(25)
    //myNum(1..100)
    var ray=array(arrayOf("brother,kid,book,flower"))
    println(ray)
}
fun numbers(numbers:IntRange) {
    for (num in numbers) {
       if (num%2!==0){
           println(num)
       }
    }

}


    fun array(myArr: Array<String>) :Int{
        var numLong=0
        for (longest in myArr) {
            if (longest.length > 5){
           ++numLong
            }
            //else{
                //numLong=0
            //}
        }
        return numLong
    }




fun serve(age:Int){
 when(age){
     in 0..6 -> println("one glass")
     in 7..14-> println("one bottle of fanta orange")
     else-> println("a bottle of coca cola")
 }

}
 //fun myNum(nums:IntRange) {
   //  for (num in nums) {
     //    if (num % 3 == 0) {
       //      println("Fizz")
         //} else if (num % 5 == 0) {
           //  println("Buzz")
         //} else if (num % 3 == 0 && num % 5 == 0) {
           //  println("FizzBuzz")
         //}
        // else{
          //   println("not applicable")
         //}
     //}
 //}
fun num1(nums:IntRange){
    for (num in nums){
        when(num){

        }
    }
}

