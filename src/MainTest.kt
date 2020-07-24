
// main function
fun main(args : Array<String>) {
    val p = Person("Pradeep", "Mishra")
    println(p.fname)
    p.nickName = "Rinku"
    println(p.nickName)

    var sam: Sample = Sample()
//    for loop with range
    for(i in 1..100){
        if (i % 5 == 0 && i % 7 == 0)
            println(i)
    }
//    for loop inside for loop
    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (i%j == 0)
                println(i)
            break@loop
        }
    }
    val arrs = arrayOf("Kotlin", "Python", "Java", "Scala", "Javascript")
    var i = 0
//    while loop and string.startsWith, array.size, indexing
    while (i < arrs.size){
        if (arrs[i].startsWith("Py")){
            arrs[i] = "Pycon"
        }
        i++
    }
//    foEach with lambda expression
    arrs.forEach {arr -> println(arr) }
    for (arr in arrs){
        if (arr.startsWith("Py")){
            println(arr)
        }
    }
//    forEach with if else expression
    arrs.forEach { if(it.startsWith("Java")) println("great") else println("not great") }

    val list = listOf(1,2,3, "Python")
    list.forEach{element -> println(element)}
    foo()
    bar()

//    Character literals go in single quotes: '1'.
    println(decimalDigitValue('8'))
    // Creates an Array<String> with values ["0", "1", "4", "9", "16"]
    val asc = Array(5) { i -> (i * i).toString() }
    asc.forEach { println(it) }

    for (i in 1..3) {
        println(i)
    }
    for (i in 6 downTo 0 step 2) {
        println(i)
    }

//    If you want to iterate through an array or a list with an index, you can do it this way:
    for (i in asc.indices) {
        println(asc[i])
    }
//    Alternatively, you can use the withIndex library function: like enumerate in python
    for ((index, value) in asc.withIndex()) {
        println("the element at $index is $value")
    }

    var colors_1: Array<String> = arrayOf("green", "red", "blue")
    var colors_2: Array<String?> = arrayOfNulls(3)
    var colors_3: Array<String> = emptyArray()
    val human = Human("Ankit", 8)
    println(human.name)
    println(human.age)
    human.age = 20
    human.age = 30
    human.name = "Akash"
}