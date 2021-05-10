package exemplos.funcional

import exemplos.executaDiv
import exemplos.executaMultiplicacao
import exemplos.orientacaoobjetos.Conta
import exemplos.orientacaoobjetos.Funcionario
import javax.imageio.stream.FileCacheImageOutputStream

fun main() {
    var block: Conta.() -> Unit = {
        saldo+=2000
    }
    val jordi = Conta(numeroConta = "231", titular = "jordi", saldo = 1000.0)
    jordi.run(block)
    println(jordi.saldo)



}

private fun aprendendoSobreWith() {
    val caio = Conta(numeroConta = "123", titular = "Caio", saldo = 200.0)
    var jordi = Conta(numeroConta = "231", titular = "jordi", saldo = 1000.0)
    with(jordi) {
        saldo.equals(1000.0)
        realizaTransferencia(destinatario = caio, valor = 300.0)
        saldo <= 700
        depositar(500.0)

    }
    println(jordi.saldo)
}

private fun conhecendoApply(): Funcionario {
    var block: Funcionario.() -> Unit = {
        salario += 240.0
        println(salario + bonificacao())
    }

    var blockConta: Conta.() -> Unit = {
        depositar(2500.0)
    }

    var conta = Conta(numeroConta = "123", titular = "Caio", saldo = 100.0).apply(blockConta).let(::println)

    var funcionario = Funcionario(nome = "Jordi Henrique Marques da Silva", cpf = "123.123.123-12", salario = 2500.0)
        .apply(block)
    return funcionario
}

private fun aprendendoSobreVariavelLetESeuEscopo() {
    val nome: String = "Jordi"
    var nomeCompleto = nome.let { "$it Henrique Marques da Silva" }
    println(nomeCompleto)
    nomeCompleto.let { n ->
        n.toUpperCase()

    }.let(::println)
    var listOf = listOf("Jordi", "Thalyta", "Gabriel", "Pedro")
    listOf.filter { it.contains("o") }.map { n -> "Nome: $n" }.forEach(::println)
    listOf.filter { it.contains("a") }.map { n -> "Nome: $n" }.forEach(::println)
}


fun teste(valor: String, bloco: () -> Unit) {
    print(valor)
    bloco()
}

fun calculadora(a: Int, b: Int, resultado: (Int, Int) -> Any) {
    println(resultado(a, b))
}