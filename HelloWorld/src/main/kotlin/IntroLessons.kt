fun variablesAndValues() {
// Variables w/ keyword 'var' are mutable and can be changed,
// but are statically typed: meaning that the data type can not change
    var userName: String = "Cam"
    userName = "Cameron"
// Values w/ keyword 'val' can not be changed. If you try to change it, you will get error
    val age: Int = 19
// Kotlin can infer types. You don't have to define types each time
    val test1 = "test"
    val test2: String = "test"
    // test1 = test2

    println("Hello $userName you are $age years old")
}

fun integerTypes(){
    var number = 19
    val integerMaxValue = Int.MAX_VALUE // 2_147_483_647
    val integerMinValue = Int.MIN_VALUE // -2_147_483_648
// In Kotlin/Java, Integers are stored with 32 bits, so the range of an integer is -2^31 <-> 2^31-1
    println("Integer max value: $integerMaxValue")
    println("Integer min value: $integerMinValue")
    //  number = 2_147_483_648 // Too large

    val byteMaxValue: Byte = Byte.MAX_VALUE // 127
    val byteMinValue: Byte = Byte.MIN_VALUE // -128
// Bytes are stored with 8 bits
// Byte Range = -2^7 <-> 2^7-1
    println("Byte max value: $byteMaxValue")
    println("Byte min value: $byteMinValue")

    val shortMaxValue: Short = Short.MAX_VALUE // 32767
    val shortMinValue: Short = Short.MIN_VALUE // -32768
// Shorts are stored with 16 bits
// Short Range = -2^15 <-> 2^15-1
    println("Short max value: $shortMaxValue")
    println("Short min value: $shortMinValue")

    val longMaxValue: Long = Long.MAX_VALUE // 9_223_372_036_854_775_807
    val longMinValue: Long = Long.MIN_VALUE // -9_223_372_036_854_775_808
// Longs are stored with 64 bits
// Long Range = -2^63 <-> 2^63-1
    println("Long max value: $longMaxValue")
    println("Long min value: $longMinValue")

// Variables and Values will always default to being Integer data type
//  unless you specify with a postfix 'L'
    val long1 = 54L // data type = Long
// Java/Kotlin also default values > 2^31 to be set to Long
    val long2 = 98765432123456789 // data type = Long
}

fun floatAndDouble(){
// Java defaults floating point (decimal place) numbers to Doubles
// Can cast doubles to Float using postfix F
    val myNumber = 2.0 // Data type = Double
    var mySecondNumber : Float = 2.5F
    mySecondNumber = 3F // equals 3.0 even though the '.0' is not explicitly written

    println("My Number = $myNumber. My Second Number = $mySecondNumber")

}

fun charAndBoolean(){
// In Kotlin/Java, Char values need single quotes ('value')
    val myCharValue: Char = 'C'
// Boolean is always a binary 'true' or 'false' value
    val myBooleanValue: Boolean = true
    println(myBooleanValue)
    println(myCharValue)
}

fun operators() {
    var x = 5
    val y = 3

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}") // Integer Division: Truncates after ones place
    println("x % y = ${x % y}") // Remainder Division

    val z = 3.0
    println("x / z = ${x / z}") // non-integer division

// Kotlin/Java follows typical Order of Operations:
// Parenthetical -> Exponential -> Multiplicative/Divisional -> Additional/Subtractive
    println("3 + 3 * 4 = ${3+3*4}") // 15

    var number = 5
    number = number + 4
    number += 4
    println("number = $number") // 13

// value++ returns the value then increments the value by one.
// ++value increments the value by one then returns the value.
// value-- returns the value then decrements the value by one.
// --value decrements the value by one then returns the value.

    x = 0
    println("x++ = ${x++}")
    println("x++ = ${x++}")
    println("++x = ${++x}")
    println("x-- = ${x--}")
    println("--x = ${--x}")

    val isActive = number > 5
    if (isActive == true || isActive) {
        println("The condition is true")
    }else println("The condition is false")

    println(true && true) // true
    println(!true) // false
    println(true && false) // false
    println(false || true) // true

    var condition = !true
    val text = if(condition){
        println("Condition is true")
        "Text true"
    }else{
        println("Condition is false")
        "Text False"
    }

    val textOrNum = if(condition) "String" else 5
    println("$textOrNum ${textOrNum::class.qualifiedName}")

}

fun nullLesson(){
// Null values have no memory reference
//  will throw 'null point exception'
    val text1: String? = null // must add question mark to data type to not get null point exception
//    println(text.length) // will throw error
    if (text1 != null) println(text1.length)
    else println("Variable is null") // brute force method to check for nulls

    var text2: String? = null // '?' is called a Safe Call Opperator
//    println(text2!!.length) // null point exception
    text2 = "Some Text"
    println(text2!!.length) // prints 9

// The following expression checks if tempText is null and if, it stores the String "Some text" to text3
//  if textTemp is not null text3 = textTemp
    val textTemp = null
    val text3: String = textTemp ?: "Some text"
    println(text3)

// Long form Version of previous idea
    val tempText_ = null
    val text3_ = if (tempText_ == null) "Some text" else tempText_
    println(text3)
}

fun main(){
    nullLesson()
}