package totalnotafiscal;
import java.util.Scanner;

public class ItemNotaFiscal {
    
    float precoComposto;
    float precoTotal;
    int quantidade;
    Produto produto = new Produto();
    Scanner ler = new Scanner(System.in);
    
    public void getTotal(Produto produto){
        
        precoComposto = produto.preco * (1 + produto.aliquota);
        precoTotal = quantidade * precoComposto;
        
    }
    
    public void getQuantidade(){
        
        System.out.print("Quantidade do produto: ");
        quantidade = ler.nextInt();
        
    }
    
}
