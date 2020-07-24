import java.util.*
import kotlin.math.pow
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaModifierListOwner

fun main(){
    val l = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    list of even numbers
    val evens = l.filter {
        it%2 == 0
    }
//    list of odd numbers
    val odds = l.filter{
        it%2==1
    }

    //val evenums = l.filter(fun(num: Int) = num%2 == 0) // anonymous function
    val ints = listOf(1, 2, 3, 4, 5, 6)
    val odd = ints.filter(modulo(1))
    val even = ints.filter(modulo(2))
    println(odd)
    println(even)
    println(ints)
    println(funEven(2))

    // `filter` takes function reference
    listOf(1, 2, 3, 4).filter(valEven)
    // !! ERROR
    listOf(1, 2, 3, 4).filter{funEven(it)}
    listOf(1, 2, 3, 4).filter(::funEven)

//    Note: val creates a function reference, fun creates a function. To convert a function, into a reference use ::
    foo(1.0, 1.2) { a, b-> a.pow(b) }
    foo(1.0, 1.2, Math::pow)
    print("Enter a positive integer number: ")
    val number: Int = Integer.valueOf(readLine())
    val factorial = computeFact(number)
    println("Factorial of $number = $factorial")
    val x: Int = 10
    val y: Int = 20
    println(x.compare(y))
    val z = x addNums y // which is same as x.addNums(y)
    println(z)
}

// Extension function
fun Int.compare(other: Int): Int = if(this > other) this else other
// infix function (infix function only accepts one parameter, all infix function can be a extension function but not vice versa)
infix fun Int.addNums(other: Int): Int = this + other
//TailRec function
// ?: expression

fun modulo(k: Int): (Int) -> Boolean = { it % k == 0 }  // returning a lambda
val isEven: (Int) -> Boolean = modulo(2)
fun funEven(i: Int): Boolean = i % 2 == 0
val valEven : (Int) -> Boolean = { it % 2 == 0 }
val valOdd : (Int) -> Boolean = {it % 2 == 1}
fun funOEven(k: Int): Boolean = k % 2 == 0

fun foo(num1: Double, num2: Double, f:(Double, Double)->Double) = f(num1, num2)
fun Int.isOdd(): Boolean = this % 1 == 0

fun checkDivisible(): List<Int>?{
    val resultingNums = mutableListOf<Int>()
    for(i in 2000..3200){
        if(i%5 == 0 && i%7 == 7)
            resultingNums.add(i)
    }
    return resultingNums
}

fun computeFact(num: Int): Int{
    return if(num == 1){
        num
    }
    else{
        num * computeFact(num-1)
    }
}

