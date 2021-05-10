package exemplos

import exemplos.orientacaoobjetos.Funcionario

private fun testandoAssociacaoEaGRUPAMENTO() {
    val jordi = Funcionario(nome = "jordi", cpf = "123.123.123-12", salario = 25.0)
    val gabriel = Funcionario(nome = "Gabriel", cpf = "321.321.321-32", salario = 15.0)
    val pedro = Funcionario(nome = "Pedro", cpf = "321.321.321-32", salario = 12.0)
    val listOf = listOf(jordi, gabriel, pedro)
    val funcionarioMap = listOf.associate { l: Funcionario -> Pair(l.nome, l) }
    println(funcionarioMap)

    val func = listOf.associateBy { f -> f.nome }
    println("associate by\n\n\n ${func}")

    val associeateFunc = listOf.groupBy { f -> f.salario > 20 }.toMutableMap()
    println("associate with\n\n\n ${associeateFunc}")
}
