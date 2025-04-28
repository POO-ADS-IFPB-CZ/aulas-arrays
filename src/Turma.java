public class Turma {

    private Professor professor;
    private Aluno[] alunos;

    public Turma(Professor professor, Aluno[] alunos) {
        this.professor = professor;
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
}
