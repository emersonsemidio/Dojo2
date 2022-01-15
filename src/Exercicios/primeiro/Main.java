package Exercicios.primeiro;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CadastroCliente clienteNovo = new CadastroCliente("", "");
        CadastroLivro livroNovo = new CadastroLivro("", "");
        RemoverCliente remocaoCliente = new RemoverCliente("", "");


        ArrayList clienteCadastrado = clienteNovo.cadatrarCliente();
        clienteCadastrado = clienteNovo.cadatrarCliente();

        /*for(int i=0;i<clienteCadastrado  .size(); i++){
            System.out.println(clienteNovox.get(i));
        }*/

        System.out.println("Iniciando Remoção");

        ArrayList<Cliente> clienteNovox = remocaoCliente.removerCliente(clienteCadastrado);
        for(int i=0;i<clienteNovox.size(); i++){
            System.out.println(clienteNovox.get(i).getNome());
        }
        // clienteCadastrado = clienteNovo.cadatrarCliente();





    }
}
