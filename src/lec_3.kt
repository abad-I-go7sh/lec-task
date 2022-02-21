fun main() {

   var m=75;
    when(m){
        in 90..100 ->{
            println("a")
        }
        in 80..89 ->{
            println("v")
        }
        else ->{
            println("f")
        }
    }
    //بتعد تصاعدي
    for (i in 1..5){
        println("helo")
    }
//بتعد تنازلي للارقام
    for (c in 5 downTo 1){
        println(c)

    //هيطنش اخر سطر
    for (c in 5 until  1){
        println(c)

    }
    //هتقفذ مرتين
    for (i in 1..5 step 2){
        println(i)
    }
        for (i in 1..5){
            if (i==3){
                break
            }
            println(i)
        }

        }
    //هتعمل اسكب للقيمة و بعدها يكمل
    for (i in 1..5){
        if (i==3){
            continue
        }
        println(i)
    }
    println("************")
    var s=1;
    while (s<=5){
        println("helo")
        s++

    }

    var n = 1;
    do {
        println("helo")
      n++
    } while (n <= 5)


}
