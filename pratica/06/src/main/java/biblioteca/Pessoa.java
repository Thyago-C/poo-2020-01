package biblioteca;

public class Pessoa {
    
    private String nome;
    private int anoNascimento;
    
    public Pessoa(String nome, int anoNascimento){
        
        setNome(nome);
        setAnoNascimento(anoNascimento);
        
    }
    
    public void setAnoNascimento(int anoNascimento){
        
        this.anoNascimento = anoNascimento;
        
    }
    
    public int getAnoNascimento(){
        
        return anoNascimento;
        
    }
    
    public void setNome(String nome){
        
        this.nome = nome;
        
    }
    
    public String getNome(){
        
        return nome;
        
    }
    
    @Override
    public String toString(){
        
        return getNome() + "(nascimento: " + getAnoNascimento() + ")";
        
    }
    
}
