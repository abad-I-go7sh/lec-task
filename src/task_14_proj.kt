
//add aray
var cars = arrayOf("marsedes", "hundai", "kia","bmw")


fun  main(){//يتم استعاء FUN في MAIN

    car_delet("marsedes","kia")

    car_disblay("hundai","skouda")

    car_searsh("bmw")

    car_new()

}


//delet
    fun car_delet (x:String,y:String){
    for (i in cars.indices) {
        if (cars[i] == x) {
            cars[i] = "delet"

            //هتطلع من for كلو
        }
        if (cars[i] == y) {
            cars[i] = "delet"
            break
            //هتطلع من for كلو
        }
    }
    for (n in cars) {
        if (n == "delet") {
            continue
        }
        println(n)
    }
    println(" successfully deleted a $x,$y ")

    println("")

}
//disblay
fun car_disblay (x:String,y:String){

    for (i in cars.indices) {
        if (cars[i] == x) {
            var new_name = y
            cars[i] = new_name
            break
        }

    }
    for (n in cars) {
        if (n == "delet") {
            continue
        }
        println(n)



    }
    println(" Switched $x into $y successfully")

}
//searsh

fun car_searsh (x:String) {

    var inp = x
    var ex = "no-ex"
    for (i in cars.indices) {
        if (cars[i] == inp) {
            ex = "ex"
            println(ex)
            println("The search was successful and the car is found : $x")
            break
        }
    }

}
//view a new array
fun car_new(){
    for (n in cars) {
        if (n == "delet") {
            continue
        }
        println(n)
    }

    println("The new array has been view successfully")


}
