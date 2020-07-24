##### To create an array, we can use a library function <code>arrayOf()</code>`` and pass the item values to it, so that <code>arrayOf(1, 2, 3)</code> creates an array <code>[1, 2, 3]</code>. Alternatively, the <code>arrayOfNulls()</code> library function can be used to create an array of a given size filled with null elements.

Another option is to use the <code>Array</code> constructor that takes the array size and the function that can return the initial value of each array element given its index:

<pre>
// Creates an Array<String> with values ["0", "1", "4", "9", "16"]
val asc = Array(5) { i -> (i * i).toString() }
asc.forEach { println(it) }
</pre>

###Primitive type arrays
Kotlin also has specialized classes to represent arrays of primitive types without boxing overhead: ByteArray, ShortArray, IntArray and so on. These classes have no inheritance relation to the Array class, but they have the same set of methods and properties. Each of them also has a corresponding factory function:
<pre>
val x: IntArray = intArrayOf(1, 2, 3)
x[0] = x[1] + x[2]
</pre>

<pre>
// Array of int of size 5 with values [0, 0, 0, 0, 0]
val arr = IntArray(5)

// e.g. initialise the values in the array with a constant
// Array of int of size 5 with values [42, 42, 42, 42, 42]
val arr = IntArray(5) { 42 }

// e.g. initialise the values in the array using a lambda
// Array of int of size 5 with values [0, 1, 2, 3, 4] (values initialised to their index value)
var arr = IntArray(5) { it * 1 }
</pre>

###Generics