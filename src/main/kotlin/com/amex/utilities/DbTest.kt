package com.amex.utilities

import com.amex.dao.IndiviualSubSystems
import com.amex.models.Address
import com.amex.models.Gender
import com.amex.models.Indiviual
import java.time.LocalDate
import kotlin.random.Random

fun main () {
    var individualSubSystem=IndiviualSubSystems()
for(record in 1..100) {
    individualSubSystem.addIndiviual(Indiviual(Random.nextInt(122, 232323).toLong(), Address(), "dsdasd", Gender.FEMALE,
        LocalDate.of(Random.nextInt(1900,2023), Random.nextInt(2,12), Random.nextInt(3,25))))

    }

    var ind = Indiviual(34324234, Address(), "hard", Gender.FEMALE,
    LocalDate.of(Random.nextInt(1900,2023), Random.nextInt(2,12), Random.nextInt(3,25)))
    individualSubSystem.addIndiviual(ind)

    individualSubSystem.getAllIndiviual().forEach{indiviual -> println("${indiviual.accNo} ${indiviual.dob}") }

    println(individualSubSystem.getIndiviualById(34324234).surName)

    ind.gender = Gender.MALE
    ind.surName ="Badjati"
    var ind1 = individualSubSystem.updateIndiviual(ind)

    println(ind1.surName + " "+ ind1.gender + ind1.accNo)

    individualSubSystem.deleteIndiviual(34324234)

//    individualSubSystem.getIndiviualById(34324234)

    individualSubSystem.getAllIndiviual().sortedWith( Comparator { o1, o2 -> o1.dob.compareTo(o2.dob) }).forEach { ind ->
        println("${ind.accNo} ${ind.dob}")
    }

}