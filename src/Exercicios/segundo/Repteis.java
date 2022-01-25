package Exercicios.segundo;

public class Repteis implements Animal, ComportamentosRepteis {

    @Override
    public void rastejar() {
        System.out.println("Rastejam");
    }

    @Override
    public void alimentar() {
        System.out.println("Existem Carnivoros, Herbivoros e Onivoros");
    }

    @Override
    public void reproduzir() {
        System.out.println("Reprodução Sexuada");
    }

    @Override
    public void respirar() {
        System.out.println("Respiração pulmonar");
    }
}
