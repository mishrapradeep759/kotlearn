// sample implementation of factory design pattern

interface Phone {
    fun getSpec()

}

interface OS : Phone{

}

interface Android : OS

interface IOS : OS

interface Windows : OS


class Samsung: OS{
    override fun getSpec() {
        println("cool samsung os")
    }
}


class Iphone: OS{
    override fun getSpec() {
        println("iphone os")
    }
}


class GetFactoryObject{
    fun getInstance(type: String): Phone{
        return if (type == "samsung")
            Samsung()
        else
            Iphone()
    }
}

fun main(){
    val factory = GetFactoryObject()
    val obj = factory.getInstance("windows")
    obj.getSpec()
}
class TreeNode<String>(val value: String?, val next: TreeNode<String>? = null)