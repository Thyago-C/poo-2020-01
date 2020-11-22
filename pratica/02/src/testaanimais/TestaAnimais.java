package testaanimais;

public class TestaAnimais {

    public static void main(String[] args) {
        
        int i;
        Animal[] animal = new Animal[3];
        
        animal[0] = new Sapo();
        animal[1] = new Cachorro();
        animal[2] = new Boi();
        
        for(i = 0; i <  3; i++){
            
            System.out.println(animal[i].som());
            
        }
        
    }
    
}
