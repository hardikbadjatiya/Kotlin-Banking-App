import kotlin.random.Random


fun otpgen():Int{
    return Random.nextInt(90000,100000);
}

fun otpGenWithName(name : String , customerId : Int) = if(customerId >10000 ) name.substring(2,5) + Random.nextInt(1,10002) else
        name.substring(1,4)+Random.nextInt(9000,9999);

fun parseData(customerId:String):Int ?=customerId.toIntOrNull()

fun generatePass (name: String, customerId: String) : String {
    var id  =  parseData(customerId);
    return if(id!=null) otpGenWithName(name, id)
    else
        "Not possible for generate"
}
 fun main() {
    for(i in 1..5)
    println("Otp index $i generated  = ${otpgen()}")

    println("generated pass for ${generatePass("hardikcool", "fghsdfsdf")}")
     println("generated pass for ${generatePass("hardikcool", "")}")

    println("generated pass for ${generatePass("hardikcool", "1212")}")
     // String templates
     var format = String.format("gfdsgdfgf  %s", generatePass("hardik4545" , "655141564"))

     println("Genereated new pass : $format")
     var an = 2323;
     println(an.toString().padStart(12,'('))

}