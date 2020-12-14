package pessoatelefone;
import java.util.*;

public class Pessoa {
    
    private String nome;
    private Set telefones = new HashSet();

    public Pessoa(String nome) {
        
        setNome(nome);
        
    }

    public String getNome() {
        
        return nome;
        
    }

    public void setNome(String nome) {
        
        this.nome = nome;
        
    }

    public void adicionaTelefone(Telefone telefone) {
        telefones.add(telefone);
    }

    public void removeTelefone(Telefone telefone) {
        
        telefones.remove(telefone);
        
    }
    
    @Override
    public String toString() {
        
        return getNome() + " telefones: " + telefones.toString();
        
    }
    
}