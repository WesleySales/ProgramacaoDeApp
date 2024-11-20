package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Animal {

    protected static int geradorIdAnimal = 100;
    protected int id;
    protected String nome;
    protected int idade;
    protected double peso;
    protected String cor;
    protected String especie;

    public static List<Animal> listaDeAnimais = new ArrayList<>();

    public Animal(String nome, int idade, double peso, String cor, String especie) {
        this.id = geradorIdAnimal++;
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.cor = cor;
        this.especie = especie;
    }

    public int setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
            return 5;
        } else {
            return 3;
        }

    }

    public String getNome() {
        return nome;
    }

    public int setNome(String nome) {
        if (nome.length() < 2) {
            return 1;
        } else {
            this.nome = nome;
            return 5;
        }
    }

    public String emitirSom() {
        return "Fazendo barulho: ";
    }

    public void cadastrarAnimal(String nome, int idade, double peso, String cor, String especie) {
        Animal novoAnimal = new Animal(nome, idade, peso, cor, especie);
        listaDeAnimais.add(novoAnimal);
    }
    
  

    public void cadastrarAnimal() {
        listaDeAnimais.add(this);
    }

    //Funcao de busca geral de animais -> Retorna a lista com todos os animais cadastrados
    public static String listarAnimais() {

        if (!listaDeAnimais.isEmpty()) {

            StringBuilder sb = new StringBuilder();

            for (Animal a : Animal.listaDeAnimais) {
                sb.append(a).append("\n");
            }

            return sb.toString();
        }
        return null;
    }

    //Filtro de busca de animais por especie
    public static String listarAnimaisPorEspecie(String especie) {
        if (!listaDeAnimais.isEmpty()) {

            StringBuilder sb = new StringBuilder();

            for (Animal a : Animal.listaDeAnimais) {
                if (a.getEspecie().equals(especie)) {
                    sb.append(a).append("\n");
                }
            }

            return sb.toString();
        }
        return null;
    }

    public static Animal buscarPorNome(String nome) {
        if (!listaDeAnimais.isEmpty()) {
            for (Animal a : listaDeAnimais) {
                if (a.getNome().equalsIgnoreCase(nome)) {
                    return a;
                }
            }
        }
        return null;
    }

    //Funcao para editar as informações dos animais -> Possibilita que o usuario altere informações como Peso e Cor
    public static void editarAnimal(String nome, double novoPeso, int novaIdade, String novoNome) {
        var animal = Animal.buscarPorNome(nome);
        animal.setNome(novoNome);
        animal.setPeso(novoPeso);
        animal.setIdade(novaIdade);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
            return 5;
        } else {
            return 2;
        }
    }

    public double getPeso() {
        return peso;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public String toString() {
        return "id: " + id + ", Nome: " + nome + ", Idade: " + idade + ", peso=" + peso + "kg, cor: " + cor + ", especie: " + especie;
    }

}
