class FundChecck {
    private var cashInAccount: Double = 1000.00

    fun getAmount() = cashInAccount

    fun increaseCashInAccount(cashDeposited: Double){
        cashInAccount += cashDeposited

    }

    fun decreseCashInAccount(cashWithDrawn: Double){
            cashInAccount -= cashWithDrawn
    }

    fun haveEnoughMoney(cashToWithdrawl: Double): Boolean{
        if(cashToWithdrawl <= cashInAccount ){
            decreseCashInAccount(cashToWithdrawl)
            println("withdraw complete. Available balance is: ${getAmount()}")
            return true
        }
        else{
            println("you don't have enough money")
            return false
        }
    }

    fun makeDeposite(cashToDeposite: Double){
        increaseCashInAccount(cashToDeposite)
        println("deposite complete. Current balance is: ${getAmount()}")
    }
}

