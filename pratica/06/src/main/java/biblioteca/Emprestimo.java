package biblioteca;

import java.util.Date;

public class Emprestimo {
    
    private Livro obra;
    private Pessoa funcionario, usuario;
    private Date data;
    
    public Emprestimo(Livro obra, Pessoa funcionario, Pessoa usuario, Date data){
        
        setObra(obra);
        setFuncionario(funcionario);
        setUsuario(usuario);
        setData(data);
        
    }
    
    public Pessoa getFuncionario(){
        
        return funcionario;
        
    }
    
    public void setFuncionario(Pessoa funcionario){
        
        this.funcionario = funcionario;
        
    }
    
    public Livro getObra(){
        
        return obra;
        
    }
    
    public void setObra(Livro obra){
        
        this.obra = obra;
        
    }
    
    public Pessoa getUsuario(){
        
        return usuario;
        
    }
    
    public void setUsuario(Pessoa usuario){
        
        this.usuario = usuario;
        
    }
    
    public Date getData(){
        
        return data;
        
    }
    
    public void setData(Date data){
        
        this.data = data;
        
    }
    
    @Override
    public String toString(){
        
        return "Livro emprestado: " + obra.toString() + "\n" + "Funcionario: " +
                funcionario.getNome() + "\n" + "Data: " + getData().toString();
        
    }
    
}
