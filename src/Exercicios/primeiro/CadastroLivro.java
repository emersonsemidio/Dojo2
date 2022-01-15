package Exercicios.primeiro;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroLivro extends Livro{

    ArrayList<Livro> dadosLivro = new ArrayList();
    Scanner scan = new Scanner(System.in);

    public CadastroLivro(String autor, String titulo) {
        super(autor, titulo);
    }



    public void cadastrarLivro(){
        System.out.println("autor: ");
        setAutor(scan.next());


        System.out.println("titulo");
        setTitulo(scan.next());

        dadosLivro.add(new Livro(getAutor(), getTitulo()));

        for(Livro liv: dadosLivro){
            System.out.println(liv.getAutor() + " " + liv.getTitulo());
        }


    }


}
