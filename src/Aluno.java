import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Aluno extends Pessoa{


    private Double[] notas;
    private List<Curso> cursos = new ArrayList<>();
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Double[] getNotas() {
        return notas;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
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
        curso.addAluno(this);
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
        disciplina.addAluno(this);
    }

    public void imprimir() {
        super.imprimir();

        System.out.println("Informações do Aluno:");
        System.out.println("Cursos:");

        for (Curso curso : cursos) {
            System.out.println(curso.getNome());
        }

        System.out.println("Disciplinas:");

        for (Disciplina disciplina : disciplinas) {
            System.out.println(disciplina.getNome());
        }

        System.out.println("Notas: " + Arrays.toString(notas));
    }
}
