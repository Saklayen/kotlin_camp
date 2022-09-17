fun main() {


    var obj = MyLogger()
    obj.log()
}

open class MyLogger : Loger() {
    override fun log() {
        println("logging from MyLoger")
        super.log()
    }
}

open class Loger : Rule {
    override fun log() {
        println("logging from logger")
    }
}

interface Rule {
    fun log()
}