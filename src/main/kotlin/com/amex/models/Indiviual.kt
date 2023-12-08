package com.amex.models

import java.time.LocalDate

class Indiviual (_accountNo : Long , _address : Address, _surName : String , _gender : Gender , _dob : LocalDate) : Customer(_accountNo) {
    var surName = _surName
    var gender = _gender
    var dob = _dob
    override var code = "c"
    override fun logEvents() {
        TODO("Not yet implemented")
    }
//    override fun showCustomerData(): String {
//        return super.showCustomerData() +" " +this.dob + " " + this.gender;
//       // this.accNo will not come as it is private in the Customer class
//    }

}