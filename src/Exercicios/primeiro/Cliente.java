package Exercicios.primeiro;

public class Cliente {
    private java.lang.String nome;
    private java.lang.String cpf;

    public Cliente(java.lang.String nome, java.lang.String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public java.lang.String getNome() {
        return nome;
    }

    public java.lang.String getCpf() {
        return cpf;
    }

    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }

    public void setCpf(java.lang.String cpf) {
        this.cpf = cpf;
    }
}
