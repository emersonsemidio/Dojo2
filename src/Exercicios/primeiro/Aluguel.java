package Exercicios.primeiro;

public class Aluguel {
    String livroAlugado;
    String cpf;
    boolean isAlugado;

    public Aluguel(String livroParaAlugar, String cpf) {
        this.livroAlugado = livroParaAlugar;
        this.cpf = cpf;
        this.isAlugado = true;
    }

    public String getLivroAlugado() {
        return livroAlugado;
    }

    public void setLivroAlugado(String livroAlugado) {
        this.livroAlugado = livroAlugado;
    }



    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean isAlugado() {
        return isAlugado;
    }

    public void setAlugado(boolean alugado) {
        isAlugado = alugado;
    }
}
