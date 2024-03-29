package br.com.digitalhouse;

public class Aluno {

    private int ra;
    private String nome;
    private String sobreNome;
    private Curso curso;


    public Aluno(int ra, String nome, String sobreNome, Curso curso) {
        this.ra = ra;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.curso = curso;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public boolean equals(Object outroAluno) {


        // SÓ PARA GARANTIR QUE É UM TIPO ALUNO. NÃO PODE PASSAR CACHORRO / PROFESSOR / ETC
        if (!(outroAluno instanceof Aluno)) {
            return false;
        }

        // AGORA VAMOS COMPARAR SE O "RA" E O "NOME" SÃO IGUAIS.
        if (((Aluno) outroAluno).getRa() == this.getRa() && ((Aluno) outroAluno).getNome().equals(this.getNome())) {

            return true;

        } else {
            return false;
        }
    }

    public int hashCode(){
        return ra + nome.hashCode();
    }

    public String toString(){
        return "RA: " + getRa() + "\n Nome: " + getNome()+
                "\n Sobrenome: " + getSobreNome() +
                "\n Curso: " + getCurso().getNome();
    }

}
