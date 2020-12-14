package pessoa2;

public class TestaPessoa2 {
    
    public static void main(String args[]){
        
        Pessoa pessoa1, pessoa2;
        
        pessoa1 = new Pessoa("João da Silva");
        pessoa2 = new Pessoa("Maria de Jesus");
        
        System.out.println(pessoa1);
        System.out.println(pessoa2);
        
        pessoa2.setNome(pessoa1.getNome());
        
        System.out.println(pessoa1);
        System.out.println(pessoa2);
        
    }
    
}
