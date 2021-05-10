package exemplos

fun main() {
    val novaFuncao: () -> String = { "Kotlin é legal" }
    println(novaFuncao())
    //expressao lambda
    val somaTresNumeros: (Int, Int, Int) -> Int = { a, b, c -> a + b + c }
    val somaDoisNumeros = { a: Int, b: Int -> a + b }
    println(somaTresNumeros(1, 2, 3))
    println(somaDoisNumeros(5, 5))

    //expressao anonima
    val funcaoAnonima = fun(text: String): String {
       return "Seja bem vindo:  $text"
    }
    println(funcaoAnonima("Jordi"))

}
