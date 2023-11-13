import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Professor extends Pessoa{
    private String titulacao;
    private double salario;
    private List<Curso> cursos = new ArrayList<>();
    private List<Disciplina> disciplinas = new ArrayList<>();

    // Métodos getter e setter para titulacao, salario, cursos e disciplinas

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void addCurso(Curso curso) {
        cursos.add(curso);
        curso.addProfessor(this);
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
        disciplina.setProfessor(this);
    }

    public void imprimir() {
        super.imprimir();

        System.out.println("Informações do Professor:");
        System.out.println("Titulação: " + titulacao);
        System.out.println("Salário: " + salario);
        System.out.println("Cursos lecionados:");

        for (Curso curso : cursos) {
            System.out.println(curso.getNome());
        }

        System.out.println("Disciplinas lecionadas:");

        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getNome());
        }
    }
}
