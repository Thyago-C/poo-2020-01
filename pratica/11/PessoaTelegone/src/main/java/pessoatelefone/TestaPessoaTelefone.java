package pessoatelefone;

public class TestaPessoaTelefone {
        
    public static void main(String[] args) {

        int i;
        Pessoa pessoa = new Pessoa("Zeca dos Telefones");

        for (i = 1; i <= 9; i++) {
            
            pessoa.adicionaTelefone(new Telefone(Integer.toString(i)));
            
        }
        
        Telefone t10 = new Telefone("10");
        pessoa.adicionaTelefone(t10);

        System.out.println(pessoa);

        pessoa.removeTelefone(t10);

        System.out.println(pessoa);
    } 
    
}
