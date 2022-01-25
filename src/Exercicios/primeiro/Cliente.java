package Exercicios.primeiro;

import java.util.ArrayList;

public class Cliente {
    private String nome;
    private String cpf;
    private ArrayList<Aluguel> dadosAlugueisPorCliente = new ArrayList();

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public ArrayList<Aluguel> getDadosAlugueisPorCliente() {
        return dadosAlugueisPorCliente;
    }

    public void setDadosAlugueisPorCliente(ArrayList<Aluguel> dadosAlugueisPorCliente) {
        this.dadosAlugueisPorCliente = dadosAlugueisPorCliente;
    }

    public void adicionarLivroAlugado(Aluguel aluguel) {
        dadosAlugueisPorCliente.add(aluguel);
    }

    public int buscarQuantidadeLivrosAlugados() {
        int quantidadeLivrosAlugados = 0;

        for (int i = 0; i < dadosAlugueisPorCliente.size(); i++) {
            if (dadosAlugueisPorCliente.get(i).isAlugado() == true) {
                quantidadeLivrosAlugados++;
            }
        }

        return quantidadeLivrosAlugados;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public boolean verificarTresUltimosLivrosAlugados(String tituloLivroAtualQuerAlugar) {
        int tamanhoLista = dadosAlugueisPorCliente.size();
        int minimo = 0;

        switch (tamanhoLista) {
            case 0:
            case 1:
            case 2:
                minimo = 0;
                break;
            default:
                minimo = tamanhoLista - 3;
                break;
        }

        for (int i = tamanhoLista; i > minimo; i--) {
            int indice = i - 1;
            Aluguel aluguel = dadosAlugueisPorCliente.get(indice);

            if (aluguel.getLivroAlugado().equalsIgnoreCase(tituloLivroAtualQuerAlugar)) {
                return false;
            }
        }

        return true;
    }
}
