package Exercicios.primeiro;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoverCliente extends CadastroCliente {
    ArrayList<Cliente> remocaoCliente = new ArrayList();
    Scanner scan = new Scanner(System.in);

    public RemoverCliente(String nome, String cpf) {
        super(nome, cpf);
    }

    public ArrayList<Cliente> removerCliente(ArrayList<Cliente> clientesCadastrados){
        System.out.println("Nome a ser removido: ");
        setNome(scan.next());

        System.out.println("Cpf a ser removido: ");
        setCpf(scan.next());

        remocaoCliente.add(new Cliente(getNome(), getCpf()));

        String nome = new String("primeiro");
        String cpf = new String("123");

        for(int i=0;i<clientesCadastrados.size(); i++){
            /*if(clientesCadastrados.contains(remocaoCliente)){
                clientesCadastrados.remove(remocaoCliente);
            }*/
            System.out.println("Lendo atualmente");
            System.out.println(clientesCadastrados.get(i).getNome());
            System.out.println("Lido");
            if (clientesCadastrados.get(i).getNome().equalsIgnoreCase(nome) && clientesCadastrados.get(i).getCpf().equalsIgnoreCase(cpf)) {
                clientesCadastrados.remove(i);
                System.out.println("Removendo item");
                System.out.println(i);
                System.out.println("Removido");
            }
        }



        // clientesCadastrados.remove(0);


        return clientesCadastrados;
    }

    public ArrayList<Cliente> getRemocaoCliente() {
        return remocaoCliente;
    }

    public void setRemocaoCliente(ArrayList<Cliente> remocaoCliente) {
        this.remocaoCliente = remocaoCliente;
    }

    public ArrayList<Cliente> removerCliente2(ArrayList<Cliente> clientesCadastrados) {
        // clientesCadastrados.get(1);
        return clientesCadastrados;
    }
}
