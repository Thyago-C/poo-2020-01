package pessoa;
import java.util.Date;

public class TestaPessoa {
    
    public static void main(String args[]){
        
        Pessoa pessoa = new Pessoa("Rodrigo", "castanho", "parda", "preto", java.sql.Date.valueOf("1980-12-25"), 
        "José", "Maria", "Goiânia", 70, (float) 1.81, "15 de novembto", "10", "14", "0", "Estrela Dalva", 
                java.sql.Date.valueOf("2000-12-25"), java.sql.Date.valueOf("2010-12-25"), "BR12345", "DPF", 
                java.sql.Date.valueOf("2000-12-25"), "1234568", "Goiânia", "PC");
        
        System.out.println(pessoa);
        
    }
    
}
