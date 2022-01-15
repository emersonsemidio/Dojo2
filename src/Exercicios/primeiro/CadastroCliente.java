package Exercicios.primeiro;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroCliente extends Cliente {
    public ArrayList<Cliente> dadosCliente = new ArrayList();
    Scanner scan = new Scanner(System.in);

    public CadastroCliente(java.lang.String nome, int cpf) {
        super(nome, cpf);

    }
     public ArrayList<Cliente> cadatrarCliente(){
             System.out.println("Nome: ");
             setNome(scan.next());


             do {
                 System.out.println("Cpf");
                 setCpf(scan.nextInt());
             }while(getCpf() > 10 && getCpf() < 20);

             dadosCliente.add(new Cliente(getNome(), getCpf()));

             for(Cliente c: dadosCliente){
                 System.out.println(c.getNome() + " " + c.getCpf());
             }

             System.out.println(dadosCliente.size());

             return dadosCliente;
    }

    public ArrayList<Cliente> getDadosCliente() {
        return this.dadosCliente;
    }

    public void setDadosCliente(ArrayList<Cliente> dadosCliente) {
        this.dadosCliente = dadosCliente;
    }
}
