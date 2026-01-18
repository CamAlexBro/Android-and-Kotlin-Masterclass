fun main(){
//First Lesson------------------------------------------
    sayHello("Conner", 19 /*Arguments for parameter 'name' and 'age'*/)
    sayHello("Charles", 23)

    val hasConnection = true
    if (hasConnection) getData("Some data")
    else showMessage()

//Return Lesson------------------------------------------
    getMax(9,100)
    println("Max of 9 and 100 is ${getMax(9,100)}")

//Single Line Lesson_____________________________________
    getMin(3.5,2.4)
    getMin(3,5)

//Default Parameters lesson------------------------------
    sendMessage()
    sendMessage("Charles")
    sendMessage(message =  "Howdy")
    sendMessage(
        name = "Charles",
        message = "Howdy"
    )

//vararg lesson------------------------------------------
    println(sum(5,6,7,8))
    println(sum(1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,10))
    printAll(1,2,3,4,5,6,7,8,9,9,8,7,6,5,4,3,2,10)
}


//First Lesson-------------------------------------------
fun sayHello(name: String, age: Int /*parameter: DataType*/){
//    age = 300 // does not work
    val number = age // does work, but limited to scope of function
    println("Hello, $name. You are $age years old")
}

fun getData(data: String){
    println("Your data is: $data")
}

fun showMessage(){
    println("There is no internet connection")
}


// Return Lesson------------------------------------------
//keyword name(parameters): returnType{functionComponents; return returnStatement}
fun getMax(a: Int, b: Int): Int /*return type defaults to void*/{
    val max = if (a > b) a else b
    return max
    println("This text will not be printed")
}

fun getMin(a: Int, b: Int) = if (a < b) a else b
fun getMin(a: Double, b: Double) = if (a < b) a else b
// Single statement function's do not need curly brackets,
// replace return keyword with equal sign
// Inferred Data Type

fun printText(){
    println("This text will print")
    return
    println("This text will not print")
}

fun sendMessage(name: String = "Cameron", message: String = "No Message"){
    println("Name = $name and message = $message")
    // Making Changes to push
}

//vararg lesson------------------------------------------------
fun sum(a: Int,b: Int,c: Int,d: Int): Int{
  return a + b + c + d
}

// a variable argument or 'vararg' acts as an array full of objects of the given data type
fun sum(vararg nums: Int): Int {
    var result = 0
    for (num in nums){
        result += num
    }
    return result
}

fun printAll(vararg nums: Int){
    nums.forEach{ println(it)}
}