package cd;
import java.util.Date;

public class CD {
    
    private Date dataLancamento;
    private String titulo;
    private Pessoa cantor;
    
    public CD(Date dataLancamento, String titulo, String nomeCantor, Date dataNascimentoCantor, int idadeCantor){
        
        cantor = new Pessoa(nomeCantor, dataNascimentoCantor, idadeCantor);
        
        setTitulo(titulo);
        setDataLancamento(dataLancamento);
        
    }
    
    public void setTitulo(String titulo){
        
        this.titulo = titulo;
        
    }
    
    public String getTitulo(){
        
        return titulo;
        
    }
    
    public void setDataLancamento(Date dataLancamento){
        
        this.dataLancamento = dataLancamento;
        
    }
    
    public Date getDataLancamento(){
        
        return dataLancamento;
        
    }
    
    @Override
    public String toString(){
        
        return "Titulo: " + titulo + "\nData de lançamento: " + dataLancamento +
                "\nCantor(a): " + cantor.getNome();
        
    }
    
}
