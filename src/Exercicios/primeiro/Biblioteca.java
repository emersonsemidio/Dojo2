package Exercicios.primeiro;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Biblioteca {
    private ArrayList<Livro> dadosLivros = new ArrayList();
    private ArrayList<Cliente> dadosCliente = new ArrayList();
    private ArrayList<Aluguel> dadosAlugueis = new ArrayList();
    private Scanner scan = new Scanner(System.in);
    private int idLivro=1;


    public void menuInicial(){
        int numero;

        System.out.println("""
                [0] para encerrar o programa
                [1] para cadastrar cliente
                [2] para cadastrar livro
                [3] para remover cliente
                [4] para remover livros
                [5] para listar clientes
                [6] para listar livros
                [7] para alugar livro
                [8] para devolver livro""");

        System.out.println("Digite o que deseja fazer");
        numero = scan.nextInt();


            switch (numero) {
                case 0:
                    System.out.println("Programa encerrado");
                    break;
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    cadastrarLivro();
                    break;
                case 3:
                    removerCliente();
                    break;
                case 4:
                    removerLivros();
                    break;
                case 5:
                    listarClientesCadastrados();
                    break;
                case 6:
                    listarLivros();
                    break;
                case 7:
                    alugarLivro();
                    break;
                case 8:
                    devolverLivro();
                    break;
                default:
                    System.out.println("Digite uma opção válida");
                    menuInicial();
                    break;
            }
    }

    public void cadastrarCliente(){
        String nome;
        String cpf;

        System.out.println("nome");
        nome = scan.next();

        do {
            System.out.println("Cpf");
            cpf = scan.next();
        }while (buscarClientePorCpf(cpf) != null);

        Cliente clienteNovo = new Cliente(nome, cpf);

        dadosCliente.add(clienteNovo);
        menuInicial();
    }

    public void listarClientesCadastrados(){

        for(int i=0; i<dadosCliente.size(); i++){
            System.out.println(dadosCliente.get(i).getCpf());
            System.out.println(dadosCliente.get(i).getNome());
            System.out.println("-------------\n");
        }
        menuInicial();
    }

    public void removerCliente(){
        String cpf;
        System.out.println("Digite o cpf a ser removido");
        cpf = scan.next();

        for(int i=0; i<dadosCliente.size(); i++){
          if(dadosCliente.get(i).getCpf().equalsIgnoreCase(cpf)){
              dadosCliente.remove(i);
              System.out.println("Cliente removido");
              menuInicial();
          }else{
              System.out.println("Cliente não encontrado");
              menuInicial();
          }
        }
    }

    public void cadastrarLivro(){
         String autor;
         String titulo;
         String editora;
         int dia, mes, ano;


         System.out.println("Autor");
         autor = scan.next();

        System.out.println("titulo");
        titulo = scan.next();

        System.out.println("editora");
        editora = scan.next();

        do{
            System.out.println("Dia");
            dia = scan.nextInt();
        }while(dia>30 && dia<1);

        do{
            System.out.println("Mês");
            mes = scan.nextInt();
        }while(mes>12 && mes<1);

        Date anoAtual = new Date();
        int year = anoAtual.getYear();

        do{
            System.out.println("Ano");
            ano = scan.nextInt();
        }while(ano>year && ano<1900);

        Livro livro = new Livro(autor, titulo, editora, new Date(ano, mes, dia));


       if(verificarLivroCadastrado(livro)==true){
           System.out.println("Livro já existe");
           menuInicial();
       }else{
           livro.setID(idLivro++);
           dadosLivros.add(livro);
           menuInicial();
       }


    }

    public boolean verificarLivroCadastrado(Livro livro){
        for(int i=0;i<dadosLivros.size();i++){
            if(dadosLivros.get(i).getTitulo().equalsIgnoreCase(livro.getTitulo()) && dadosLivros.get(i).getEditora().equalsIgnoreCase(livro.getEditora())){
                return true;
            }
        }
        return false;
    }

    public void listarLivros(){

        for(int i=0; i<dadosLivros.size(); i++){
            System.out.println(dadosLivros.get(i).getAutor());
            System.out.println();
            System.out.println(dadosLivros.get(i).getTitulo());
            System.out.println();
            System.out.println(dadosLivros.get(i).getEditora());
        }
        menuInicial();
    }

    public void removerLivros(){
        String titulo;

        System.out.println("Titulo");
        titulo = scan.next();

        for(int i=0; i< dadosLivros.size(); i++){
            if(dadosLivros.get(i).getTitulo().equalsIgnoreCase(titulo)){
                dadosLivros.remove(i);
                System.out.println("Livro removido");
                menuInicial();
            }
        }
    }

    public Cliente buscarClientePorCpf(String cpf){
        for(int i=0;i<dadosCliente.size(); i++){
            if(dadosCliente.get(i).getCpf().equalsIgnoreCase(cpf)){
                return dadosCliente.get(i);
            }
        }

        return null;
    }

    public void alugarLivro(){
        String livroAlugado;
        int qtdAlugueis = 1;
        String cpf;
        Cliente clienteEncontrado;

        System.out.println("Cpf");
        cpf = scan.next();

        clienteEncontrado =  buscarClientePorCpf(cpf);
        if (clienteEncontrado == null) {
            System.out.println("Cliente não encontrado");
            menuInicial();
            return;
        }

        int quantidadeLivrosAlugadosDesteCliente = clienteEncontrado.buscarQuantidadeLivrosAlugados();

        if (quantidadeLivrosAlugadosDesteCliente >= 2) {
            // Não pode alugar pq já atingiu o limite
            System.out.println("Cliente alugou já 2 livros");
            menuInicial();
            return;
        }

            System.out.println("Qual livro deseja alugar?");
            livroAlugado = scan.next();

            Aluguel alugandoLivro = new Aluguel(livroAlugado, cpf);

            int indiceLivroEncontrado = buscarIndiceLivro(livroAlugado);

            if (indiceLivroEncontrado >= 0) {//Encontrou o livro na biblioteca

                System.out.println("Livro alugado");
                dadosAlugueis.add(alugandoLivro);
                alugandoLivro.isAlugado = true;
                clienteEncontrado.adicionarLivroAlugado(alugandoLivro);
                menuInicial();

                //Está dando para um cliente alugar um livro que está alugado no momento.
            } else {
                System.out.println("Livro não encontrado");
                menuInicial();
            }
    }

    public int buscarIndiceLivro(String titulo) {
        for (int i = 0; i < dadosLivros.size(); i++) {
            if (dadosLivros.get(i).getTitulo().equalsIgnoreCase(titulo)) {
                return i;
            }
        }
        return -1;
    }

    public void devolverLivro(){
        String livroParaDevolver;
        String cpf;

        System.out.println("Qual livro deseja devolver? ");
        livroParaDevolver = scan.next();

        while(buscarIndiceLivro(livroParaDevolver)==-1){
            System.out.println("Livro não encontrado");
            System.out.println("Qual livro deseja devolver? ");
            livroParaDevolver = scan.next();
        }

        System.out.println("Cpf");
        cpf = scan.next();

        while (buscarClientePorCpf(cpf)==null){
            System.out.println("Cpf não encontrado");
            System.out.println("Cpf: ");
            cpf = scan.next();
        }

        for(int i=0; i<dadosAlugueis.size(); i++){
            if(dadosAlugueis.get(i).getCpf().equalsIgnoreCase(cpf) && dadosAlugueis.get(i).getLivroAlugado().equalsIgnoreCase(livroParaDevolver)){
                System.out.println("Livro devolvido");
                dadosAlugueis.get(i).setAlugado(false);
                menuInicial();
            }
        }
    }
}
