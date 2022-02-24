fun main() {
    //ctrl+alt+l
    //add
    var nam = arrayOf("abed", "mhmoud", "auda")
    println(nam[1])
//disblay
    for (i in 0..nam.size) {
        println(nam[i])
    }
    //for eash
    for (n in nam) {
        println(n)
    }
    // هيجيب الرينج الطريقة الثالثة لطباعة كل المصفوفة
    println(nam.indices)
    for (i in nam.indices) {
        println(nam[i])
    }
    var i = 0;
    while (i <= nam.size) {
        println(nam[i])
        i++
    }
    //searsh
    var inp = readLine().toString()
    var ex = "no-ex"
    for (i in nam.indices) {
        if (nam[i] == inp) {
            ex = "ex"
            println(ex)
            break
        }
    }
    //delet
    println("print name a delet")
    var d_name = readLine().toString()
    for (i in nam.indices) {
        if (nam[i] == d_name) {
            nam[i] = "delet"
            println(" ok delet")
            break
            //هتطلع من for كلو
        }
        for (n in nam) {
            if (n == "delet") {
                continue

            }

            println(n)
        }

    }
    println("enter name edit")
val ed_name= readLine().toString()//abed
    for (i in nam.indices){
        if (nam[i]==ed_name){
         println("enter new name")
         var  new_name= readLine().toString()
            nam[i]=new_name
            break

        }

    }
    for (n in nam) {
        if (n == "delet") {
            continue

        }

        println(n)
    }


}


