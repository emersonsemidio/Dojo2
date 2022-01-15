package Exercicios.primeiro;

import java.util.ArrayList;
import java.util.Date;

public class Livro {
    private String autor;
    private String titulo;
    private String editora;
    private Date dataPublicacao;

    public Livro(String autor, String titulo, String editora, Date dataPublicacao) {
        this.autor = autor;
        this.titulo = titulo;
        this.editora = editora;
        this.dataPublicacao = dataPublicacao;
    }

    public Livro() {
    }


    public String getEditora() {
        return editora;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }
}
