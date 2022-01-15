package Exercicios.primeiro;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoverCliente extends CadastroCliente {
    ArrayList<Cliente> remocaoCliente = new ArrayList();
    Scanner scan = new Scanner(System.in);

    public RemoverCliente(String nome, int cpf) {
        super(nome, cpf);
    }

    public ArrayList<Cliente> removerCliente(ArrayList<Cliente> clientesCadastrados){
        System.out.println("Nome a ser removido: ");
        setNome(scan.next());

        System.out.println("Cpf a ser removido: ");
        setCpf(scan.nextInt());

        remocaoCliente.add(new Cliente(getNome(), getCpf()));

        for(int i=0;i<clientesCadastrados.size(); i++){

            System.out.println("Lendo atualmente");
            System.out.println(clientesCadastrados.get(i).getNome());
            System.out.println("Lido");
            if (clientesCadastrados.get(i).getNome().equalsIgnoreCase(getNome()) && clientesCadastrados.get(i).getCpf() == getCpf()) {
                clientesCadastrados.remove(i);
                System.out.println("Removendo item");
                System.out.println(i);
                System.out.println("Removido");
            }
        }



        return clientesCadastrados;
    }

    public ArrayList<Cliente> getRemocaoCliente() {
        return remocaoCliente;
    }

    public void setRemocaoCliente(ArrayList<Cliente> remocaoCliente) {
        this.remocaoCliente = remocaoCliente;
    }

}
