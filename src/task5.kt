fun main() {
println("Just enter your name")
var name= readLine()
    println(name!!.toUpperCase())
    println("Enter the father's name")
    var name1= readLine()
    println(name1!!.toLowerCase())
    println("Enter the name of the grandfather")
    var name2:String= readLine().toString()
    println(name2.toUpperCase())
    println("Enter the family name")
    var name3= readLine()
    println(name3!!.toUpperCase())

    println("**********************************************")

    println(name.toLowerCase())
    println(name1.get(0).toUpperCase()+name1.substring(1))
    print(name2.substring(0,name2.length-1).toUpperCase())
    println(name2.get(name2.length-1).lowercase())
    println(name3.lowercase())
    println("**********************************************")




}