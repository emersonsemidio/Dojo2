package Exercicios.primeiro;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<Livro> dadosLivros = new ArrayList();
    private ArrayList<Cliente> dadosCliente = new ArrayList();
    private Scanner scan = new Scanner(System.in);

    public void cadastrarCliente(){
        String nome;
        int cpf;

        System.out.println("nome");
        nome = scan.next();

        System.out.println("Cpf");
        cpf = scan.nextInt();

        Cliente clienteNovo = new Cliente(nome, cpf);

        dadosCliente.add(clienteNovo);
    }

    public void listarClientesCadastrados(){

        for(int i=0; i<dadosCliente.size(); i++){
            System.out.println(dadosCliente.get(i).getCpf());
            System.out.println(dadosCliente.get(i).getNome());
            System.out.println("-------------\n");

        }
    }

    public void removerCliente(){
        int cpf;
        System.out.println("Digite o cpf a ser removido");
        cpf = scan.nextInt();

        for(int i=0; i<dadosCliente.size(); i++){
          if(dadosCliente.get(i).getCpf() == cpf){
              dadosCliente.remove(i);
              break;
          }
        }
    }

    public void cadastrarLivro(){
         String autor;
         String titulo;
         String editora;
         Date dataPublicacao;

         System.out.println("Autor");
         autor = scan.next();

        System.out.println("titulo");
        titulo = scan.next();

        System.out.println("editora");
        editora = scan.next();

        Livro livro = new Livro(autor, titulo, editora, new Date(2000, 5, 20));

        dadosLivros.add(livro);
    }

    public void listarLivros(){

        for(int i=0; i<dadosLivros.size(); i++){
            System.out.println(dadosLivros.get(i).getAutor());
            System.out.println();
            System.out.println(dadosLivros.get(i).getTitulo());
            System.out.println();
            System.out.println(dadosLivros.get(i).getEditora());
            //System.out.println(dadosLivros.get(i).getTitulo());
        }
    }

    public void removerLivros(){
        String titulo;

        System.out.println("Titulo");
        titulo = scan.next();

        for(int i=0; i< dadosLivros.size(); i++){
            if(dadosLivros.get(i).getTitulo().equalsIgnoreCase(titulo)){
                dadosLivros.remove(i);
                break;
            }
        }
    }





}
