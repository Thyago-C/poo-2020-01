package autorpessoa;

public class TesteLivroPessoaEditora {

    public static void main(String[] args){
        
        Pessoa pessoa = new Pessoa("Clive Staples Lewis", 1898);
        
        String endereco = new String("Rua Prof. Laerte Ramos de Carvalho, 133 – Bela Vista – São Paulo");
        Editora editora = new Editora("WMF Martins Fontes", endereco);
        
        Livro livro1 = new Livro("As Crônicas de Nárnia", editora, pessoa, 2015);
        
        System.out.println(livro1);
        
    }
    
}
