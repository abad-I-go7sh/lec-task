fun main() {
var coint=0
var sum=0
    println("Enter the first number:")
    var x:Int= readLine().toString().toInt()
    println("Enter The second number:")
    var y:Int= readLine().toString().toInt()
    for (i in x..y){
            coint = coint + i
            sum++

        }
    var avg:Double=coint / sum.toString().toDouble()

    println("The average value of the numbers between them :" + avg )



    }







