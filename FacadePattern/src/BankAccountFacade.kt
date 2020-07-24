class BankAccountFacade(val accountNumber: Int, val securitycode: Int) {
    var welcomeToBannk: WelcomeToBannk? = null
    var acccountChecker: AccountNumberCheck? = null
    var securityChecker: SecurityCodeCheck? = null
    var fundChecker: FundChecck? = null

    constructor(){
        welcomeToBannk = WelcomeToBannk()
        acccountChecker = AccountNumberCheck()
        securityChecker = SecurityCodeCheck()
        fundChecker = FundChecck()
    }

    fun getAccNumber() = accountNumber
    fun getSecCode() = securitycode

    fun withdrawCash(cash: Double){
        if(acccountChecker?.checkAcccountNumber(getAccNumber()) ? &&
            securityChecker?.checkSecurityCode(getSecCode())  ? &&
        fundChecker?.haveEnoughMoney(cash)){

        }
    }
}