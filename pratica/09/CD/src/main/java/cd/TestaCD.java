package cd;
import java.util.Date;

public class TestaCD {
    
    public static void main(String args[]){
        
        CD cd;
        
        cd = new CD(java.sql.Date.valueOf("2015-06-08"), "Beneath the skin", "Nanna Bryndís Hilmarsdóttir", java.sql.Date.valueOf("1989-05-06"), 31);
        
        System.out.println(cd);
        
    }
    
}
