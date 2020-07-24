class SecurityCodeCheck {

//    Kotlin style coding
    private val securityCode: Int = 9876

    fun getSecurityCode(): Int = securityCode

    fun checkSecurityCode(secCode: Int): Boolean = getSecurityCode() == secCode
}