fun main(){
   printName("Racheal")

    divide(67,25)

 var result=add(5,6, 8, 9)
    println(result)

    printFact("curious")
}

fun printName(name: String) {
    println("Hello" + " " + name)
}


fun divide(num1: Int, num2: Int) {
        var modulus = num1%num2
        println(modulus)
    }

fun add(x:Int, y:Int, q:Int, z:Int): Int {
    var sum=x+y+q+z
    return sum
}


fun printFact(fact: String){
    println("I am always" +" "+ fact)
}