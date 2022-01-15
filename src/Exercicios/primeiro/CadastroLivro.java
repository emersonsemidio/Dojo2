package Exercicios.primeiro;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class CadastroLivro extends Livro{

    ArrayList<Livro> dadosLivro = new ArrayList();
    Scanner scan = new Scanner(System.in);

    public CadastroLivro(String autor, String titulo, String editora, Date dataPublicacao, ArrayList<Livro> dadosLivro) {
        super(autor, titulo, editora, dataPublicacao);
        this.dadosLivro = dadosLivro;
    }

    public void cadastrarLivro(){
        System.out.println("autor: ");
        setAutor(scan.next());

        System.out.println("titulo");
        setTitulo(scan.next());

        System.out.println("Editora: ");
        setEditora(scan.next());

        dadosLivro.add(new Livro(getAutor(), getTitulo(), getEditora(), new Date(2000, 5, 10)));

        for(Livro liv: dadosLivro){
            System.out.println(liv.getAutor() + " " + liv.getTitulo());
        }


    }


}
