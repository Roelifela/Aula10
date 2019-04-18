package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa("RODRIGO", 1234);
        Pessoa pessoa2 = new Pessoa("RODRIGO", 1235);

        List<Pessoa> pessoas = new ArrayList<>();

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);

        System.out.println(pessoa1.equals(pessoa2));


    }


}
