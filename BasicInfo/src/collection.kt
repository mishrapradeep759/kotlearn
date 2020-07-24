fun main(){
//    array and list
    val alangs = arrayOf("Python", "Java", "Kotlin", "Julia")
    val llangs = listOf("C", "C++", "Scala", "Ruby")
    val mutablelangs = mutableListOf<String>("Python", "Julia", "Scala")

//    maps
    val imap = mapOf<String, Int>("id" to 1, "pay" to 15000)
    val mutableimap = mutableMapOf<String, String>("name" to "Pradeep", "lang" to "Python")
    val items = HashMap<String, Int>()
    items["A"] = 10
    items["B"] = 20

    for ((k, v) in items) {
        println("$k = $v")
    }

    alangs.forEach{lang -> println(lang)}
    for(lang in alangs){
        println(lang)
    }
    llangs.forEach{println(it)}
    llangs.forEachIndexed{index, value -> println("value $value is at index $index")}
    for(lang in llangs){
        println(lang)
    }
    imap.forEach{ (key, value) -> println("key is $key and value is $value")}
    for((key, value) in mutableimap){
        println("$key = $value")
    }
//    for(key in mutableimap){
//        println(mutableimap.get(key))
//    }
    println(mutableimap["encode"])
}

fun main(args: Array<String>) {

    val items2 = hashMapOf("A" to 10, "B" to 20, "C" to 30)
    items2["D"] = 40

    // foreach example
    println("\n-- Example 2.1 --");
    items2.forEach { (k, v) ->
        println("$k = $v")
    }

    // foreach + filter
    println("\n-- Example 2.1 --");
    items2.forEach { (k, v) ->
        if (v == 10) {
            println("$k = $v")
        }
    }
    println(items2.keys)
    println(items2.entries)
    println(items2.values)
    println("${items2.keys::class.simpleName}")
    println("${items2.values::class.simpleName}")
    println("${items2::class.simpleName}")
//    if(items2::class.simpleName){
//        println("hashmap type")
//    }
    println(items2.containsKey("A"))
    // using the special 'it' like this
    println("\n-- Example 2.2 --");
    items2.forEach { println("key : ${it.key}, value : ${it.value}") }

}

//fun defArray(){}

fun fib(num: Int): Long =
    when(num){
        0 -> 1
        1 -> 1
        else -> fib(num-1) + fib(num-2)
    }

// varargs example

fun greetGuest(name: String, vararg msgs: String){
    msgs.forEach{msg-> println("$name $msg")}
}

fun getGreet(){
    val al = arrayOf("Hi", "Hello", "Welcome")
    greetGuest("Pradeep", *al)
//    OR
    greetGuest("Ankit", "hello", "hi", "Thank you!")
}