package Exercicios.primeiro;

public class Livro {
    private String autor;
    private String titulo;
    private Cliente editora;

    public Livro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public Livro() {
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
