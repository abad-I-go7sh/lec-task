fun main() {
    for (i in 2 ..10){
        if (i==6||i==4||i==2||i==10){
            continue
        }else if (i%2==0){
            print("$i")
        }
    }



}