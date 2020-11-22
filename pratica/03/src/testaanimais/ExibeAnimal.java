package testaanimais;

public class ExibeAnimal implements Operacao{
    
    @Override
    public void executa(Object obj) {
        System.out.println(((Animal)obj).som());
    }
    
    static void executaOperacao(Animal[] as, Operacao op){
      
        for (Animal a : as) {
            op.executa(a);
        }
        
    }
    
    public static void main(String[] args) {
       
        int somaIdades;
        
        ExibeAnimal som = new ExibeAnimal();
        Operacao op = som; // Upcast
        
        Animal[] animal = new Animal[3];
    
        animal[0] = new Sapo();
        animal[1] = new Cachorro();
        animal[2] = new Boi();
        
        animal[0].getMedia();
        animal[1].getMedia();
        animal[2].getMedia();
        
        animal[0].mostraIdadeMedia();
        animal[1].mostraIdadeMedia();
        animal[2].mostraIdadeMedia();
        
        somaIdades = animal[0].idadeMedia + animal[1].idadeMedia + animal[2].idadeMedia;
        
        System.out.println("A Soma das idades é: " + somaIdades);
        
        executaOperacao(animal, op);
        
    }
    
}
