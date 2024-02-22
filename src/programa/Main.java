package programa;

import socursos.Aluno;
import socursos.Curso;
import socursos.Professor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        Curso curso=new Curso();
        System.out.printf("Qual o nome do curso que queres fazer? ");
        curso.setNomeCurso(sc.next());
        System.out.println(curso.getNomeCurso());

        curso.setInfoCurso("O curso de Java COMPLETO (Programação Orientada a Objetos + Projetos)");
        System.out.println(curso.getInfoCurso());

        curso.setNomeProf("Giovana Adorno");
        System.out.println("Prof.(a): " + curso.getNomeProf());

        curso.setValorCurso(299);
        System.out.println("Valor do curso é  R$ "+curso.getValorCurso());

        curso.setListAlunos("Nayara"+ " ,Daniel ");
        System.out.println("Alunos: "+ curso.getListAlunos());

        Aluno aluno=new Aluno();
        aluno.setNomeAluno("Nayara" );
        System.out.println("\nAluno(a): " + aluno.getNomeAluno());

        aluno.setEmailAluno("nayara.scherer@bartdigital.com.br");
        System.out.println("E-mail: "+aluno.getEmailAluno());

        aluno.setTelefone("92 99999-9999");
        System.out.println("Tel.: "+ aluno.getTelefone());

        aluno.setCursosMatriculados("Java Completo");
        System.out.println("Cursos Matriculados: "+ aluno.getCursosMatriculados());

        Professor professor=new Professor();
        professor.setNomeProf("Giovana Adorno");
        System.out.println("\nProf.(a): "+ professor.getNomeProf());

        professor.setEmailProf("giovana.adorno@bartdigital.com.br");
        System.out.println("E-mail: "+ professor.getEmailProf());

        professor.setCursosMinistrados("Java");
        System.out.println("Cursos Ministrados: "+professor.getCursosMinistrados());






    }
}