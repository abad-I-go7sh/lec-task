fun main() {
    println("Enter the  number:")
    var x:Int= readLine().toString().toInt()
    for (i in x ..x){
        if (x>0){
        println(" multiplication table : $i")
        for (j in 1 ..10) {
val pro=i*j
            println("$i*$j=$pro")
        }
        }
}
}