package exemplos


fun main() {
    testasFunctionReferencia()
}
private fun testasFunctionReferencia() {
    val minhaFuncao: () -> Unit = ::executaPrint
    val minhaSoma: (Int, Int) -> Int = ::executaSoma
    val minhaMultp: (Int, Int) -> Int = ::executaMultiplicacao
    val minhadivisao: (Int, Int) -> Double = ::executaDiv
    println(minhaSoma(2, 1))
    println(minhaMultp(2, 5))
    println(minhadivisao(10, 5))
}


fun executaPrint(){
    println("Dando um salve")
}
fun executaSoma(a: Int ,b: Int):Int{
    return a+b
}
fun executaMultiplicacao(a: Int ,b: Int):Int{
    return a*b
}
fun executaDiv(a: Int ,b: Int):Double {
    return a.toDouble()/b.toDouble()
}
