package livraria_3;
import java.util.Scanner;
@SuppressWarnings("resource")
public class Ferramentas {	
    public String scan() {     
		Scanner scanner = new Scanner(System.in);
    	return scanner.next(); 
    }
    
    public String scanNextLine() {
    	Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    
    public int scanInt() {
		Scanner scanner = new Scanner(System.in);

    	return scanner.nextInt();
    }
    
    public String generatePedido() {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz"; 
        StringBuilder sb = new StringBuilder(6); 
  
        for (int i = 0; i < 6; i++) { 
            int index = (int)(AlphaNumericString.length() * Math.random()); 
  
            sb.append(AlphaNumericString.charAt(index)); 
        } 
  
        return sb.toString(); 
    }
}