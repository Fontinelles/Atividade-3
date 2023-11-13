
public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setNome("Engenharia de Software");

        Professor professor = new Professor();
        professor.setNome("João Silva");
        professor.setTitulacao("Doutor");
        professor.setSalario(5000.0);

        Aluno aluno = new Aluno();
        aluno.setNome("Maria Oliveira");

        Disciplina disciplina = new Disciplina();
        disciplina.setNome("Programação Java");

        curso.addProfessor(professor);
        curso.addAluno(aluno);
        curso.addDisciplina(disciplina);

        // Imprimir informações do curso
        curso.imprimirCurso();

        // Imprimir informações do professor
        professor.imprimir();

        // Imprimir informações do aluno
        aluno.imprimir();
    }
}