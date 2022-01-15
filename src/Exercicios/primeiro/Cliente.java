package Exercicios.primeiro;

public class Cliente {
    private java.lang.String nome;
    private int cpf;

    public Cliente(java.lang.String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
