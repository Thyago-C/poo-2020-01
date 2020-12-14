package animal;
import java.util.*;

public class Animal {

    private String nome;
    private Map amigos;
    
    public Animal(String nome){
        
        setNome(nome);
        amigos = new HashMap();
        
    }
    
    public void setNome(String nome){
        
        this.nome = nome;
        
    }
    
    public String getNome(){
        
        return nome;
        
    }
    
    public void adicionaAmigo(Animal amigo){
        
        if(!amigos.containsKey(amigo.getNome())){
            
            removeAmigo(amigo.getNome());
            amigo.removeAmigo(this.nome);
            
        }
        
    }
    
    public void removeAmigo(Animal amigo){
        
        if(amigos.containsKey(amigo.getNome())){
            
            removeAmigo(amigo);
            amigo.removeAmigo(this);
            
        }
        
    }
    
    public void removeAmigo(String nomeAmigo) {
        
        amigos.remove(nomeAmigo);
        
    }
    
    @Override
    public String toString(){
        
        return getNome();
        
    }
    
    public String amigosAnimal(){
        
        return amigos.toString();
        
    }
    
}
