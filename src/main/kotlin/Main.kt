fun main(){
   numbers(1..100)

    var ray=array(arrayOf("brother","kid","book","flower"))
    println(ray)

    serve(4)
    serve(12)
    serve(25)

    num1(1..100)
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
           numLong++
            }

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


fun num1(nums:IntRange){
    for (num in nums){
        when {
            num %3==0 && num %5==0 ->  println("FizzBuzz")
            num %3==0 -> println("Fizz")
            num %5==0 -> println("Buzz")
        }
    }
}

