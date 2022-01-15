package Exercicios.primeiro;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        abc();
    }

    public static void abc(){
        Scanner scan = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int fon;

        do{
            biblioteca.cadastrarCliente();

            System.out.println("parada");
            fon = scan.nextInt();
        }while (fon!=0);

        biblioteca.listarClientesCadastrados();
        biblioteca.removerCliente();
        biblioteca.listarClientesCadastrados();

        do{
            biblioteca.cadastrarLivro();

            System.out.println("parada");
            fon = scan.nextInt();
        }while(fon!=0);

        biblioteca.listarLivros();
        biblioteca.removerLivros();
        biblioteca.listarLivros();
    }


}
