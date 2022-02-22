fun main() {
    println("Enter the  number:")
    var x:Int= readLine().toString().toInt()

        if (x>0){
        println(" multiplication table : $x")
        for (j in 1 ..10) {
         val pro=x*j
            println("$x*$j=$pro")
        }
        }

}
