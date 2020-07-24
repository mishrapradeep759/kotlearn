// Best Document:
// https://kotlinlang.org/docs/reference/returns.html

class Sample {
    var name : String = "Kotlin"

}

class Person(val fname: String = "Pradeep", val lname: String = "Mishra"){

    init{
        val name = "$fname $lname"
        println(name)
    }
    var nickName: String? = null
        // override setter and getter
        set(value) {
            // write your business logic to set nickname
            field = value
            println("new nickname is $field")
        }
        get(){
            println("returned nickname is $field")
            return field
        }
    fun printInfo(){
        val printableNickName = nickName ?: "no Nickname"
        // OR
        val newNickname = if(nickName != null) nickName else "no nickname"
        println("$fname ($nickName) $lname")
        println("$fname ($printableNickName) $lname")
        println("$fname ($newNickname) $lname")
    }
}

var name: String = "Kotlin"

class Human(name: String, age: Int){
    var name: String = ""
    var age: Int
    init{
        this.name = name
        this.age = age
        if(this.age < 18){
            modifiedAge()
        }
    }
    fun modifiedAge(){
        this.age += 18
    }
}

class Employee(name: String, empCode: Int){
    var empCode: Int = 1
    fun setEmpCode(){
        var empCode = 1
    }

}

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Out of range")
    return c.toInt() - '0'.toInt() // Explicit conversions to numbers
}


fun foo() {
    listOf(1, 2, 3, 4, 5).forEach {
        if (it == 3) return // non-local return directly to the caller of foo()
        println(it)
    }
    println("this point is unreachable")
}

fun bar() {
    listOf(1, 2, 3, 4, 5).forEach lit@{
        if (it == 3) return@lit // local return to the caller of the lambda, i.e. the forEach loop
        print(it)
    }
    println(" done with explicit label")
}

//anonymous function
fun woo() {
    listOf(1, 2, 3, 4, 5).forEach(fun(value: Int) {
        if (value == 3) return // local return to the caller of the anonymous fun, i.e. the forEach loop
        print(value)
    })
    print(" done with anonymous function")
}

//* Note that the use of local returns in previous three examples is similar to the use of continue in regular loops.
// There is no direct equivalent for break,
// but it can be simulated by adding another nesting lambda and non-locally returning from it:

fun testTypeConversion(){
    val b: Byte = 1 // OK, literals are checked statically
    //val i: Int = b // ERROR

    //We can use explicit conversions to widen numbers
    val i: Int = b.toInt() // OK: explicitly widened
    println(i)
}

