package pessoatelefone;

public class Telefone {
    
    private String numero;

    public Telefone(String numero) {
        
        setNumero(numero);
        
    }

    public String getNumero() {
        
        return numero;
        
    }

    public void setNumero(String numero) {
        
        this.numero = numero;
        
    }
    
    @Override
    public String toString() {
        
        return getNumero();
        
    }
    
}
