import kotlin.random.Random

fun main() {
    var accountNumber:Long;

    var address : String;
    val dum = "dfdf";


    // Not possible for changing the value
//    dum = "sdsd";
        println("Acc no");
    accountNumber = readln().toLong();
    println(""+accountNumber + " " +accountNumber::class.java.typeName)

    println("Address");
    address  = readln()
    println("address"+address + " " +address::class.java.typeName)

    var name : String = readln()
    println("name "+ name
         + " "+ name::class.java.typeName)


    var customer = arrayOfNulls<Int>(5);

    for(id in customer.indices) {
        customer[id] = Random.nextInt(100000);
    }

    customer.forEach { id -> println("Customer id = $id")};

}