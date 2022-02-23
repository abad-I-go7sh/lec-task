fun main() {
    //المطلوب الاول
    //add
    var so_me = arrayOf("Facebook", "Instagram", "WhatsApp", "Twitter", "SnapChat", "Tiktok")
    for (n in so_me) {//for each  بتجيب كل القيم اللي بالمصفوفة و بتطبعهم  :for each
        print(n + ",")
    }
    println()
    println("****************************************")
    //المطلوب الثاني
    for (i in so_me.indices) {
        if (so_me[i] == "Instagram") {
            so_me[i] = "delet"

            //هتطلع من for كلو
        }
        if (so_me[i] == "SnapChat") {
            so_me[i] = "delet"
            break
            //هتطلع من for كلو
        }
    }
    for (n in so_me) {
        if (n == "delet") {
            continue
        }
        println(n)
    }
    println("")

//المطلوب الثالث والرابع
    println("****************************************")

    for (i in so_me.indices) {
        if (so_me[i] == "WhatsApp") {
            var new_name = "Telegram"
            so_me[i] = new_name
            break
        }

    }
    for (n in so_me) {
        if (n == "delet") {
            continue
        }
        println(n)
    }

}



