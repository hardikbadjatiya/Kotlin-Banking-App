import com.amex.models.Gender


fun main() {
    println("Enter cibil score..")
    val cibil = readln();
    when (cibil.toInt()) {
        in 200..500 -> println("2 100")
        in 800..100 -> println("8 1000")
        else -> println("not in range")
    }
    println("Enter gender..")
    val gender  = readln()
    when(Gender.valueOf(gender)) {
        Gender.MALE -> println("Male")
        else -> println("no ")
    }
}