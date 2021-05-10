package exemplos

fun testandoComportamentosdeMap() {
    val amigos: MutableMap<Int, String> = mutableMapOf(Pair(1, "Pedro"), Pair(2, "Bei"))

    println(amigos.get(2))
    println(amigos)
    amigos.putAll(mutableMapOf(0 to "jordi", 3 to "thay"))
    println(amigos - listOf(1, 3))
}
