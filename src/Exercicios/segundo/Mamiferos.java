package Exercicios.segundo;

public class Mamiferos implements Animal, ComportamentosMamiferos{

    @Override
    public void amamentar() {
        System.out.println("Amamenta");
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
        System.out.println("Respiração Pulmonar");
    }
}
