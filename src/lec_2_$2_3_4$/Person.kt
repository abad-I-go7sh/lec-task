package `lec_2_$2_3_4$`

/*open class Person(private var id:Int,private var name:String,private var email:String,private var password: String) {


   var i_person:Int = id

       get() {
           return field
       } set(value) {
       field=value
   }

    var n_person:String = name
        get() {
            return field
        } set(value) {
        field=value
    }
    var e_person:String = email
        get() {
            return field
        } set(value) {
        field=value
    }
    var P_person:String = password
        get() {
            return field
        } set(value) {
        field=value
    }

/////////////////11111111111////////////////////////


*/
abstract class Person (var id:Int, var name:String, var email:String, var password:String) {

    abstract fun login()

}


