package Exercicios.segundo;

public class Main {
    public static void main(String[] args){
        Mamiferos mamiferos = new Mamiferos();
        Repteis repteis = new Repteis();

        System.out.println("Mamiferos");

        mamiferos.alimentar();
        mamiferos.reproduzir();
        mamiferos.respirar();
        mamiferos.amamentar();

        System.out.println("Repteis");

        repteis.alimentar();
        repteis.reproduzir();
        repteis.respirar();
        repteis.rastejar();


    }
}
