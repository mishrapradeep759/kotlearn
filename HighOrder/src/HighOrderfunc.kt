// function take function as a parameter
fun printFilteredString(list: List<String>, predicate: ((String) -> Boolean)?){
    list.forEach{
        if(predicate?.invoke(it) == true){
            println(it)
        }
    }
}

// store function as a variable
val predicate: (String) -> Boolean = {
    it.startsWith("K")
}

// function that returns a function
fun getPrintedPredicate(): (String) -> Boolean{
    return {it.startsWith("J")}
}

fun main(){
    val list = listOf("Kotlin", "Python", "Java", "Javascript")
    printFilteredString(list, predicate)
//    other way
    printFilteredString(list){
        it.startsWith("K")
    }
    printFilteredString(list, null)

    val newList = listOf("Javascript", "Java", "Kotlin", null, null)
    newList
        .filterNotNull()
        .filter{
            it.startsWith("J")
        }
        .forEach{
            println(it)
        }

    newList
        .filterNotNull()
        .associate{
            it to it.length
        }
        .forEach{
            println("${it.key} = ${it.value}")
        }

    val map = newList.filterNotNull().associate { it to it.length }
    println(newList.sortedBy { String() })
    val numList = listOf(1, 10, 0, -8)
    val arrList = arrayOf(10, 2, 14)
    println(arrList.sorted())
    println(numList.sortedDescending())

//    Run function example:
    val personOne = Person("Sam", 20, "Programmer")
    val personTwo = Person("Dam", 30, "Bus Driver")
    val olderPerson = if (personOne.age > personTwo.age) personOne else personTwo
    olderPerson.printPerson()

    run { if (personOne.age > personTwo.age) personOne else personTwo}.printPerson()

    with(personOne){
        age += 1
        "age is now $age"
    }.println()

    personOne.run{
        age += 1
        "age is now $age"
    }.println()

    personOne.let{
        modifiedPerson -> modifiedPerson.age+=1
        "Age is now ${modifiedPerson.age}"
    }.println()

    personTwo.apply {
        age += 1
        job = "Hot dog seller"
    }.printPerson()

    val myMap = HashMap<String, String>()
    myMap["a"] = "apple"
    myMap.replace("a", "aam")

}

// .map(fun), .take(Int), .takeLast(Int), associate()

data class Person(var name:String, var age: Int, var job: String){
    fun printPerson() = println(this.toString())
}

fun String.println() = println(this)