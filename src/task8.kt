fun main() {
    println("Enter the height:")
    var x:Int= readLine().toString().toInt()
    println("Enter the offer:")

    var y:Int= readLine().toString().toInt()

    if (x==y) {
        println("The shape is a square")
        println("area of square =" + x * y)
    }else{
        println("The shape is a rectangle")
        println("area of rectangle ="+x*y)

    }


}