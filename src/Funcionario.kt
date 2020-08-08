abstract class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double
){
    open fun bonificacao(): Double {
        println("Salario dentro da classe funcionario ${salario * 0.1}")
        return salario * 0.1
    }
}





//abstract class Funcionario(
//    val nome: String,
//    val cpf: String,
//    val salario: Double
//){

//Nos praticamente estamos criando um metodo abstrato também. Pois, agora que a classe Funcionario é abstrata

// aqui temos que tirar a logica de dentro do metodo bonificacao (que é comum a todas as classes derivadas da classe Funcionario,
// para podermos deixa-la abstrata (e assim tirar o open e colocar abstract) pq assim todas as classes derivadas podem utilizar.
// Pq se simplesmente apagassemos o metodo aqui na classe mae, não poderiamos por exemplo, usar como tipo a classe Funcionario, para a classe,
// Diretor por exemplo, pq ai elas não seriam iguais, pois tem metodos
//Porque quando precisamos tratar todos os funcionarios por uma referencia abstrata comum, e tambem utilizar o metodo em comum, não podemos
//tirar da classe mae, mas também como estamos usando uma classe abstrata, não podemos
//
//    fun bonificacao(): Double {
//        println("Salario dentro da classe funcionario ${salario * 0.1}")
//        return salario * 0.1
//    }
//}


/* a ideia acima é que de colocar o abstract no lugar do open, ou de simplesmente adicionar o abstract é de que a gente não pode deixar
aberto para que exista uma pessoa do tipo Funcionario. A ideia é que ela seja ou analista, diretor, programador, e que todos usem como base
o modelo ou a base mesmo Funcionario (a classe abstrata), pois ela é uma abstração do que é um funcionario na realidade, com seu nome,
salario, cpf etc
* Texto da internet sobre classe abstrata

In object-oriented programming (OOP) languages, classes represent objects in the domain of the problem the software is intended to solve.
Classes include collections of attributes (properties) and behaviors (methods), which can be based on previously-defined classes.
Programmers use inheritance to derive the specific implementation of abstract classes. Classes that are derived from abstract classes are
called derived classes. When this principle is applied many times in succession, it results in a hierarchy of classes. In this context,
abstract classes are at the root of this hierarchy, and is used to enforce methods that need to be overridden in the derived classes,
thus avoiding potential runtime errors.

An abstract class has at least one abstract method. An abstract method will not have any code in the base class;
the code will be added in its derived classes. The abstract method in the derived class should be implemented with the same access modifier,
number and type of argument, and with the same return type as that of the base class. Objects of abstract class type cannot be created,
because the code to instantiate an object of the abstract class type will result in a compilation error.


*/

