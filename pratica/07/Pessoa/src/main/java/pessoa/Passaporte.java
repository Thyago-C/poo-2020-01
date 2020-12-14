package pessoa;
import java.util.Date;

public class Passaporte {
    
    private Date dataExpedicao, dataVencimento;
    private String numero, orgaoExpeditor;
    
    public Passaporte(Date dataExpedicao, Date dataVencimento, String numero, String orgaoExpeditor){
        
        setDataExpedicao(dataExpedicao);
        setDataVencimento(dataVencimento);
        setNumero(numero);
        setOrgaoExpeditor(orgaoExpeditor);
        
    }

    Passaporte(java.sql.Date valueOf, java.sql.Date valueOf0, int i, String bR12345, String dpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setDataExpedicao(Date dataExpedicao){
        
        this.dataExpedicao = dataExpedicao;
        
    }
    
    public Date getDataExpedicao(){
        
        return dataExpedicao;
        
    }
    
    public void setDataVencimento(Date dataVencimento){
        
        this.dataVencimento = dataVencimento;
        
    }
    
    public Date getDataVencimento(){
        
        return dataVencimento;
        
    }
    
    public void setNumero(String numero){
        
        this.numero = numero;
        
    }
    
    public String getNumero(){
        
        return numero;
        
    }
    
    public void setOrgaoExpeditor(String orgaoExpeditor){
        
        this.orgaoExpeditor = orgaoExpeditor;
        
    }
    
    public String getOrgaoExpeditor(){
        
        return orgaoExpeditor;
        
    }
    
}
