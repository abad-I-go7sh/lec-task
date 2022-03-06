package `lec_2_$2_3_4$`

 class Student (id:Int,  name:String,  email:String, password: String ,var gba: Double) :Person(id,name,email,password){//هان ما بلزم الهم انكبسليشن
  ///////////11111111///////////////////

    //انشا كونستركتر فاضي
   /* var id: Int = 0
    var name: String = ""
    private var email: String = ""
    var gba: Double=0.0
    var password: String = ""*/


  /* init {//عبارة عن انو كل ما اعمل opj بتطبع او بتنفذ كل اشي داخلها
        println("welcome")
    }*/
/*
    constructor(id: Int, name: String, email: String, password: String, gba: Double) {
        this.id = id
        this.name = name
        this.email = email
        this.password = password
        this.gba = gba
    }

    constructor(id: Int, name: String, password: String) {//
        this.id = id
        this.name = name

        this.password = password

    }

    constructor(id: Int, name: String, password: String, email: String) : this(id, name, password) {//في الوراثة لازم يكون نفس الاتربيةت اللي قبل و اصتفة عليها على الجديد+لازم يكون نفس الترتيب +لازم اعرف اللي بكتبو في ال this بين البراميتر
        this.s_email = email

    }


//enca استخدامها لما اعرق اتربيوت ب برايفت فبعملها +ما بفدر المستخدم يوصللها


    fun getemail(): String {
        return this.email
    }

    fun setemail(email: String) {

        this.email = email
        if (email.length < 8) {
            this.email = "$email@wasla.com"
        } else {
            println("roing")


        }

    }


    var s_email: String = email
        get() =
            field
        set(value) {
            if (value.length < 18) {
                field = "$value@wasla.com"

            } else {
                println("roing")


            }


        }

*/


  ///////////222222222222222222222222///////////////////


    var courses:MutableList<Course> = mutableListOf()
  fun  add_course(c:Course){

   courses.add(c)

  }
  fun  display_courses(){
   for (c in courses){
  println("${c.name}+${c.mark}")
   // println(c.n_person+c.mark)
   }


  }
//////////////33333333333333////////////////////

  override fun login() {
   println("Enter ur id ?")
   var id: Int = readLine().toString().toInt()
   println("Enter ur pass ?")
   var pass: String = readLine().toString()
   if(this.id == id && this.password == pass){
    println("Welcome")
   } else{
    println("Id or Password is wrong !")
   }
  }

  /*override fun login() {
      println("Enter ur id ?")
      var id: Int = readLine().toString().toInt()
      println("Enter ur pass ?")
      var pass: String = readLine().toString()
      if(this.id == id && this.password == pass){
          println("Welcome")
      } else{
          println("Id or Password is wrong !")
      }
  }*/



  // Overloading
  /*fun login(id:Int, pass:String){
      if(this.id == id && this.password == pass){
          println("Welcome")
      } else{
          println("Id or Password is wrong !")
      }
  }

  fun login(email:String, pass:String){
      if(this.email == email && this.password == pass){
          println("Welcome")
      } else{
          println("Email or Password is wrong !")
      }
  }*/



































   }