package pessoa;
import java.util.Date;

public class Pessoa {
    
    private String nome, corDosOlhos, corDaPele, corDoCabelo,
            nomeDoPai, nomeDaMae, localDeNascimento;
    private Date dataDeNascimento;
    private float peso, altura;
    private Residencia endereco;
    private Passaporte passaporte;
    private Identidade identidade;
    
    public Pessoa(String nome, String corDosOlhos, String corDaPele, String corDoCabelo,
            Date dataDeNascimento, String nomeDoPai, String nomeDaMae, String localDeNascimento,
            float peso, float altura, String rua, String quadra, String lote, String numero, String setor,
            Date dataDeExpedicao, Date dataDeVencimento, String numeroDoPassaporte, String orgaoExpeditor,
            Date dataDeExpedicaoIdentidade, String numeroIdentidade, String local, String orgaoExpeditorIdentidade){
        
        endereco = new Residencia(rua, quadra, lote, numero, setor);
        passaporte = new Passaporte(dataDeExpedicao, dataDeVencimento, numeroDoPassaporte, orgaoExpeditor);
        identidade = new Identidade(dataDeExpedicaoIdentidade, numeroIdentidade, local, orgaoExpeditorIdentidade);
        
        setNome(nome);
        setCorDosOlhos(corDosOlhos);
        setCorDaPele(corDaPele);
        setCorDoCabelo(corDoCabelo);
        setDataDeNascimento(dataDeNascimento);
        setNomeDoPai(nomeDoPai);
        setNomeDaMae(nomeDaMae);
        setLocalDeNascimento(localDeNascimento);
        setPeso(peso);
        setAltura(altura);
        
    }
    
    @Override
    public String toString(){
        
        return "Nome: " + nome + "\n"
                + "Endereço: " + endereco.toString() + "\n" + "Nascimento: " + 
                        dataDeNascimento;
        
    }
    
    public void setNome(String nome){
        
        this.nome = nome;
        
    }
    
    public String getNome(){
        
        return nome;
        
    }
    
    public void setCorDosOlhos(String corDosOlhos){
        
        this.corDosOlhos = corDosOlhos;
        
    }
    
    public String getCorDosOlhos(){
        
        return corDosOlhos;
        
    }
    
    public void setCorDaPele(String corDaPele){
        
        this.corDaPele = corDaPele;
        
    }
    
    public String getCorDaPele(){
        
        return corDaPele;
        
    }
    
    public void setCorDoCabelo(String corDoCabelo){
        
        this.corDoCabelo = corDoCabelo;
        
    }
    
    public String getCorDoCabelo(){
        
        return corDoCabelo;
        
    }
    
    public void setDataDeNascimento(Date dataDeNascimento){
        
        this.dataDeNascimento = dataDeNascimento;
        
    }
    
    public Date getDataDeNascimento(){
        
        return dataDeNascimento;
        
    }
    
    public void setNomeDoPai(String nomeDoPai){
        
        this.nomeDoPai = nomeDoPai;
        
    }
    
    public String getNomeDoPai(){
        
        return nomeDoPai;
        
    }
    
    public void setNomeDaMae(String nomeDaMae){
        
        this.nomeDaMae = nomeDaMae;
        
    }
    
    public String getNomeDaMae(){
        
        return nomeDaMae;
        
    }
    
    public void setLocalDeNascimento(String localDeNascimento){
        
        this.localDeNascimento = localDeNascimento;
        
    }
    
    public String getLocalDeNascimento(){
        
        return localDeNascimento;
        
    }
    
    public void setPeso(float peso){
        
        this.peso = peso;
        
    }
    
    public float getPeso(){
        
        return peso;
        
    }
    
    public void setAltura(float altura){
        
        this.altura = altura;
        
    }
    
    public float getAltura(){
        
        return altura;
        
    }  
    
}
