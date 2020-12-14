package pessoa;

public class Residencia {
   
    private String rua, quadra, lote, numero, setor;
    
    public Residencia(String rua, String quadra, String lote, String numero, String setor){
        
        setRua(rua);
        setQuadra(quadra);
        setLote(lote);
        setNumero(numero);
        setSetor(setor);
        
    }
    
    @Override
    public String toString(){
        
        return "Rua " + rua + ", Quadra " + quadra + ", Lote " + lote + ", Setor " + setor
                + ", Numero " + numero;
        
    }
    
    public void setRua(String rua){
        
        this.rua = rua;
        
    }
    
    public String getRua(){
        
        return rua;
        
    }
    
    public void setQuadra(String quadra){
        
        this.quadra = quadra;
        
    }
    
    public String getQuadra(){
        
        return quadra;
        
    }
    
    public void setLote(String lote){
        
        this.lote = lote;
        
    }
    
    public String getLote(){
        
        return lote;
        
    }
    
    public void setNumero(String numero){
        
        this.numero = numero;
        
    }
    
    public String getNumero(){
        
        return numero;
        
    }
    
    public void setSetor(String setor){
        
        this.setor = setor;
        
    }
    
    public String getSetor(){
        
        return setor;
        
    }
    
}
