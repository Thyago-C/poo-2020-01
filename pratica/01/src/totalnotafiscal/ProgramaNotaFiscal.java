package totalnotafiscal;

public class ProgramaNotaFiscal {
    
    public static void main(String[] args){
        
        int i;
        NotaFiscal nota = new NotaFiscal();
        
        nota.cadastraItem();
        
        for(i = 0; i < nota.quantidadeItens; i++){
            
            nota.item[i].getQuantidade();
            nota.item[i].produto.getProduto();
            nota.item[i].getTotal(nota.item[i].produto);
            
        }
        
        nota.getTotal(nota.item);
        
        System.out.println("O valor total da nota é: " + nota.total);
        
    }
    
    
}