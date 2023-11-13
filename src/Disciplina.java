import java.util.ArrayList;
import java.util.List;
public class Disciplina {
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();
    private Professor professor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
        aluno.addDisciplina(this);
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
        curso.addDisciplina(this);
    }


}
