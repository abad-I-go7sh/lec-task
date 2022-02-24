     fun  main(){//يتم استدعاء FUN في MAIN

        sum()
         sum1(5,5.4)
         sum2(4 ,4)
         sum1(4,4,4)
         sum2(4,2.5)

     }
     fun sum(){
         println(5+6)
     }

     fun sum1(x:Int,y:Double){
    var r:Double=x+y

         println(r)
     }

     fun sum2(x:Int,y:Int):Int{//نوع القيمة المرجعة بحددها لانو غي RUTURN
         var r:Int= x+y
         return r
     }
     fun sum2(x:Int,y:Double):Double{//نوع القيمة المرجعة بحددها لانو غي RUTURN
         var r:Double= x+y
         return r
     }
     fun sum1(x:Int,y:Int,z:Int){//OVER LOODING   //لازم الاتربيوت اللي بين البراميتر يكون مختلفين نوعا و كميتا

         var r:Int=x+y+y
         println(r)
     }

