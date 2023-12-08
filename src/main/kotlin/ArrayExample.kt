import kotlin.random.Random

fun main()  {
    var customer = arrayOfNulls<Int>(5);

    for(id in customer.indices) {
        customer[id] = Random.nextInt(100000);
    }

    customer.forEach { id -> println("Customer id = $id")};

    for(branches in 1..50)  {
        println("IFSC code for the branch $branches is  ${Random.nextInt(1000000000)}");
    }
    var index =0;
    while (index<customer.size) {

        println("customer id for index $index is ${customer[index]}");
        index++;
    }
}