package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Curso android = new Curso("ANDROID");
        Curso fullStack = new Curso("FULLSTACK");

        Aluno aluno1 = new Aluno(123, "RODRIGO", "CORDEIRO", android);
        Aluno aluno5 = new Aluno(123, "RODRIGO", "CORDEIRO", android);
        Aluno aluno2 = new Aluno(456, "FELIPE", "CORDEIRO", fullStack);
        Aluno aluno3 = new Aluno(789,"ELIZA", "CORDEIRO", fullStack);
        Aluno aluno4 = new Aluno(321, "LARISSA", "CORDEIRO", android);

        //LISTA DE ALUNOS
        List<Aluno> alunos = new ArrayList<>();

        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        alunos.add(aluno5);


        // RETORNA SE É VERDADEIRO OU FALSO
        // RETORNA FALSO SE COMPARAR O ALUNO 1 COM O 5. APESAR DE SER IGUAIS SÃO OBJETOS DIFERENTES.
        // System.out.println(aluno1.equals(aluno5));

        // AGORA VAMOS COMPARAR CONTEUDOS
        // PARA ISSO DEVEMOS INSERIR O EQUALS NA CLASSE ALUNOS.

        System.out.println(aluno1.equals(aluno5));

        System.out.println(alunos.contains(aluno5));

        System.out.println(aluno5);

    }

}
