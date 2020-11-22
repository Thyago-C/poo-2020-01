package totalnotafiscal;
import java.util.Scanner;

public class NotaFiscal {
    
    int quantidadeItens;
    int i;
    float total = 0;
    
    Scanner ler = new Scanner(System.in);
    ItemNotaFiscal[] item = new ItemNotaFiscal[40];
    
    public void cadastraItem(){
        
        System.out.print("Quantidade: ");
        quantidadeItens = ler.nextInt();
        
        for(i = 0; i < quantidadeItens; i++){
            
            item[i] = new ItemNotaFiscal();
            
        }
            
    }
    
    public void getTotal(ItemNotaFiscal item[]){
        
        for(i = 0; i < quantidadeItens; i++){
            
            total+= item[i].precoTotal;
            
        }
        
    }
    
}
