fun main() {
    var aluno1 = Aluno(1122, "Luis", "Silva" )
    var professor1 = Professor("João", 1213)
    var materia1 = Materia("Física")
    var aula1 = Aula(materia1, 20,22)

    var aluno2 = Aluno(4567, "Antonio", "Barbosa")


    professor1.adicionarNaChamada(aluno1)
    professor1.adicionarNaChamada(aluno2)
    professor1.imprimirListaDeChamadas()
}