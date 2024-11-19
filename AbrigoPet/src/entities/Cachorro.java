package entities;


public class Cachorro extends Animal{

    public Cachorro(String nome, int idade, double peso, String cor) {
        super(nome, idade, peso, cor, "CACHORRO");
    }

    @Override
    public void emitirSom() {
//        super.emitirSom(); 
        System.out.println("LATIDO");
    }
    
          
    
    
    
    
}
