class AccountNumberCheck {
    private val accountNumber: Int = 123

//    Java Style coding
    fun getAcccountNumber(): Int{
        return accountNumber
    }
    fun checkAcccountNumber(accNo: Int): Boolean{
        if (accNo == getAcccountNumber()) {
            return true
        }
        return false
    }
}