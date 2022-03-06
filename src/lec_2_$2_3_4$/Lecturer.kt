package `lec_2_$2_3_4$`

class Lecturer (id:Int,  name:String,  email:String, password: String ,salary: Double) :Person(id,name,email,password){


    /*var id: Int = 0
    var name: String = ""
    private var email: String = ""
    var password: String = ""
    var salary: Double = 0.0


    fun calSalary() {}

     */



    /*fun login(email:String, pass:String){
        if(this.email == email && this.password == pass){
            println("Welcome")
        } else{
            println("Email or Password is wrong !")
        }
    }*/

    fun calSalary(){

    }

    override fun login() {
        println("Enter ur email ?")
        var email: String = readLine().toString()
        println("Enter ur pass ?")
        var pass: String = readLine().toString()
        if(this.email == email && this.password == pass){
            println("Welcome")
        } else{
            println("Email or Password is wrong !")
        }
    }

    /*override fun login() {
        println("Enter ur email ?")
        var email: String = readLine().toString()
        println("Enter ur pass ?")
        var pass: String = readLine().toString()
        if(this.email == email && this.password == pass){
            println("Welcome")
        } else{
            println("Email or Password is wrong !")
        }
    }*/


}