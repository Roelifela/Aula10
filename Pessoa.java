package br.com.digitalhouse;

public class Pessoa {

    private String nome;
    private int rg;

    public Pessoa(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    @Override
    public boolean equals(Object mesmaPessoa) {

        if (!(mesmaPessoa instanceof Pessoa)){
            return false;
        }


        //mesmaPessoa.getRg  PARA PEGAR O CODIGO ABAIXO.

        if (((Pessoa) mesmaPessoa).getRg() == this.getRg() && ((Pessoa) mesmaPessoa).getNome().equals(this.getNome())) {

            return true;

        } else {
            return false;
        }



    }
}
