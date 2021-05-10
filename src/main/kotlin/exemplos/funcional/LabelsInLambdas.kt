package exemplos

fun main() {
    val amaKotlin: (voceAmaKoltin: Boolean)-> String= response@ {amaKotlin->
        if (amaKotlin){
            return@response "Legal voce ama kotlin"
        }
        "Que pena, você nao ama kotlin"
    }
    println(amaKotlin(false))
}