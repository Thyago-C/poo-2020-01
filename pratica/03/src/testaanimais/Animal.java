package testaanimais;
import java.util.Scanner;

public class Animal {
    
    int idadeMedia;
    Scanner ler = new Scanner(System.in);
    
    public void getMedia(){
        
        idadeMedia = ler.nextInt();
        
    }
    
    public void mostraIdadeMedia(){
        
        System.out.println(idadeMedia);
        
    }
    
    public String som(){
        
        return "somAnimal";
        
    }
    
}