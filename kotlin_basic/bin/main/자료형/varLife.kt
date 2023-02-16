package 자료형

fun main() {
    val age = 30 // Int(Bytes, Short, Int, Long)
    val myNum:Byte = 100 // 명시 가능
    val PI = 3.14 // Double(Float, Double)
    val myLetter = 'C' // Char
    val myBoolean = true // Boolean
    var name = "marinelife" // String

    // var과 val이 다른점은 val은 수정이 불가능
    // age = 20

    val longAge:Long = age.toLong() // 타입 변환
}