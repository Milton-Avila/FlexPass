package aula5;

import java.util.ArrayList;

public class Aeroporto {
    private String nome;
    private String cidade;
    private ArrayList<Voo> voos;

    public Aeroporto() {
    }

    public Aeroporto(String nome, String cidade, ArrayList<Voo> voos) {
        this.nome = nome;
        this.cidade = cidade;
        this.voos = voos;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public ArrayList<Voo> getVoos() {
        return this.voos;
    }

    public void setVoos(ArrayList<Voo> voos) {
        this.voos = voos;
    }

    public String toString() {
        return "Aeroporto " + nome + ", de " + cidade + ".\nvoos: " + voos;
    }
}
