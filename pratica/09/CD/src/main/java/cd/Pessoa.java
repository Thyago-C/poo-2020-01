package cd;
import java.util.Date;

public class Pessoa {
    
    private String nome;
    private Date dataNascimento;
    private int idade;
    
    public Pessoa(String nome, Date dataNascimento, int idade){
        
        setNome(nome);
        setDataNascimento(dataNascimento);
        setIdade(idade);
        
    }
    
    public void setNome(String nome){
        
        this.nome = nome;
        
    }
    
    public String getNome(){
        
        return nome;
        
    }
    
    public void setDataNascimento(Date dataNascimento){
        
        this.dataNascimento = dataNascimento;
        
    }
    
    public Date getDataNascimento(){
        
        return dataNascimento;
        
    }
    
    public void setIdade(int idade){
     
        this.idade = idade;
        
    }
    
    public int getIdade(){
        
        return idade;
        
    }
    
}
