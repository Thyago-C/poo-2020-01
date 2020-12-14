package pessoa;
import java.util.Date;

public class Identidade {
    
    private Date dataExpedicao;
    private String numero, local, orgaoExpeditor;
 
    public Identidade(Date dataExpedicao, String numero, String local, String orgaoExpeditor){
        
        setDataExpedicao(dataExpedicao);
        setNumero(numero);
        setLocal(local);
        setOrgaoExpeditor(orgaoExpeditor);
        
    }
    
    public void setOrgaoExpeditor(String orgaoExpeditor){
        
        this.orgaoExpeditor = orgaoExpeditor;
        
    }
    
    public String getOrgaoExpeditor(){
        
        return orgaoExpeditor;
        
    }
    
    public void setLocal(String local){
        
        this.local = local;
        
    }
    
    public String getLocal(){
        
        return local;
        
    }
    
    public void setNumero(String numero){
        
        this.numero = numero;
        
    }
    
    public String getNumero(){
        
        return numero;
        
    }
    
    public void setDataExpedicao(Date dataExpedicao){
        
        this.dataExpedicao = dataExpedicao;
        
    }
    
    public Date getDataExpedicao(){
        
        return dataExpedicao;
        
    }
    
}
