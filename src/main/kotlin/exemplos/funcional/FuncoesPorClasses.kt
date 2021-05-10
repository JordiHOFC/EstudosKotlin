package exemplos.funcional
fun main() {
    testandoFuncaoClasse()
}

private fun testandoFuncaoClasse() {
    val myClass: () -> Unit = minhaClasse()
    println(myClass())
}



class minhaClasse(): ()-> Unit{
    var nome="jordelas"
    override fun invoke() {
        println(nome)
    }

}

