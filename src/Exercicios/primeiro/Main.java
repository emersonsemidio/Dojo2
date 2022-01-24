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
        biblioteca.CadastrarClientes();
        biblioteca.CadastrarLivros();

        biblioteca.menuInicial();

    }


}
