fun main() {
  var name: String = "Abdul Rahman Ibrahim Mahmoud"
  println("Q1 :")
  println(name.toUpperCase())
  println("Q2 :")
  println(name.toLowerCase())
  println("Q3 :")
  println(name[13])
  println("Q4 :")
  println(name.substring(21))
  println("Q5 :")
  println(name.length)
  println("Q6 :")
  print(name.replace('A', '@') + "   :")
  println(name.subSequence(0, 12))
  println("Q7 :")
  var full_name: String = "AbuGhosh"
  println(name + full_name)
  println("Q8 :")
  var y = ""
  if (full_name == y){
    println("full_name is Empty")
  }else{
    println(full_name)
  }
  println("Q9 :")
  println(name.compareTo(full_name))
  println("Q10 :")
  println(full_name.toUpperCase())


}