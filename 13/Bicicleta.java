package First;

public class Bicicleta {
    
    String cor, tipo, marca;
    float valor;
    
    public static void main(String[] args){
        
        Bicicleta bicicletaInfantil = new Bicicleta();
        
        bicicletaInfantil.tipo = "Aro 16";
        bicicletaInfantil.marca = "Nathor";
        bicicletaInfantil.cor = "Preto";
        bicicletaInfantil.valor = 510;
        
        System.out.println("Bicicleta escolhida:");
        System.out.println(bicicletaInfantil.marca);
        System.out.println(bicicletaInfantil.tipo);
        System.out.println("Cor :" + bicicletaInfantil.cor);
        System.out.print("Valor: R$ " + bicicletaInfantil.valor);
        
    }
    
}
