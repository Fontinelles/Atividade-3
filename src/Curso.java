import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Curso {
    private String nome;
    private List<Professor> professores = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();
    private List<Disciplina> disciplinas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void addProfessor(Professor professor) {
        professores.add(professor);
        professor.addCurso(this);
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
        aluno.addCurso(this);
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
        disciplina.addCurso(this);
    }

    public void imprimirCurso() {
        System.out.println("Informações do Curso:");
        System.out.println("Nome: " + nome);
        System.out.println("Professores:");

        for (Professor professor : professores) {
            System.out.println(professor.getNome());
        }

        System.out.println("Alunos:");

        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome());
        }

        System.out.println("Disciplinas:");

        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getNome());
        }
    }
}
