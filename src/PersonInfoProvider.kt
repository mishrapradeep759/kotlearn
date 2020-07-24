interface PersonInfoProvider {
    val providerInfo: String
    fun printInfo(person: Person){
        println(providerInfo)
        person.printInfo()
    }
}

interface SessionInfoProvider{
    fun getSessionId(): String
}

open class BasicInfoProvider : PersonInfoProvider, SessionInfoProvider{

    open val sessionIdPrefix = "session"
    override val providerInfo: String
        get() = "BasicInfoProvider"

    override fun printInfo(person: Person) {
        super.printInfo(person)
        println("additional print statement")
    }

    override fun getSessionId(): String {
        return sessionIdPrefix
    }
}

fun main(){
    val provider = BasicInfoProvider()
    provider.printInfo(Person())
    println(provider.getSessionId())
    checkTypes(provider)
}

fun checkTypes(infoProvider: PersonInfoProvider): Boolean{
    if (infoProvider is SessionInfoProvider){
        println("is a Session info provider")
        return true
    } else {
        println("not a session info provider")
        (infoProvider as SessionInfoProvider).getSessionId()
        // Or like below (smart cast)
        infoProvider.getSessionId()
    }
    return false
}