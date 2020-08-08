class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha: Int
): Funcionario (nome = nome, cpf = cpf, salario = salario) {

    //  aqui tem codigo repetido, e na classe Diretor tbm tem. E o metodo bonficação na classe mãe é o que se repete
    // Então nos podemos reutilizar o metodo aqui tbm. Como temos o this. para falar de qual contexto estamos falando,
    // o super é usado para falar que o contexto, é o contexto da clase mãe. Isso pode tbm servir para properties, e não somente para função
    override fun bonificacao(): Double {
        println("super.bonificacao() dentro da classe gerente${super.bonificacao()}")
        println("salario dentro da classe gerente $salario")
        return super.bonificacao() + salario
    }

    fun autentica(senha: Int): Boolean {
        if(this.senha == senha){
            return true
        }
        return false
    }

}

// override -> serve para especificarmos (quando há metodos iguais, na classe mãe e na classe filha, e queremos utilizar a lógica
// do metodo que está na classe mãe, mas queremos adicionar algo específico para a classe filha, que no caso aqui, a bonificação é diferente
// para as classes Diretor e Gerente, então nós colocamos o override para falar pro Kotlin que queremos sobrescrever o metodo da clase mae.
// mas se quisermos o metodo da classe, nós chamamos ele direto, pelo nome mesmo, utilizando o super, para contextualizar que estamos
// falando da classe mae.