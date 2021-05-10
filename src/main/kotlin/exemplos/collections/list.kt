package exemplos

import java.math.BigDecimal

private fun testandoListAndArray() {
    val mutableListOf = mutableListOf(1, 2, 3)
    val filter = mutableListOf.filter { it > 1 }
    println(filter)

    val array = listOf("pedrocaBaitola", "bei")
    val bigDecimalArrayOf = bigDecimalArrayOf("12.1", "21.23")
    println(bigDecimalArrayOf.contentToString())

    val listaDeAmigos = listOf("pedrocaBaitola", "commit") + array
    println(listaDeAmigos.distinct().reversed())
}

fun bigDecimalArrayOf(vararg valores:String):Array<BigDecimal> {
    return Array<BigDecimal>(valores.size){
            i->
        valores[i].toBigDecimal()
    }
}

