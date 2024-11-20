package entities;


public class Cachorro extends Animal{

    public Cachorro(String nome, int idade, double peso, String cor) {
        super(nome, idade, peso, cor, "CACHORRO");
    }

    @Override
    public String emitirSom() {
        super.emitirSom(); 
        return "RUF RUF";
    }
    
          
    
    
    
    
}
