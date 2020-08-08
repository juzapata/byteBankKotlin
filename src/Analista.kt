class Analista(
    nome: String,
    cpf: String,
    salario: Double
): Funcionario (nome = nome, cpf = cpf, salario = salario) {
    override fun bonificacao(): Double {
        println("super.bonificacao() dentro da classe gerente${super.bonificacao()}")
        println("salario dentro da classe gerente $salario")
        return super.bonificacao() + salario * 0.1
    }
}

