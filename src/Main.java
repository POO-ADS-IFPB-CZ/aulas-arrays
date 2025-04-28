import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Professor professor =
                new Professor("João", 2000);
        Aluno aluno1 = new Aluno(123, "Maria");
        Aluno aluno2 = new Aluno(456, "Pedro");
        Aluno aluno3 = new Aluno(789, "José");
        Aluno alunos[] = {aluno1, aluno2, aluno3};

        Turma turma = new Turma(professor, alunos);

    }
}