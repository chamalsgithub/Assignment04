
import java.util.Scanner;

public class Algo_5 {

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       String text;
       

        loop1:
        do {
            
            System.out.print("Enter enter a text (ASCII only) :");
            text = sc.nextLine();
            
            if(text.isBlank()){
                System.out.println("Invalid input");
                continue loop1;
            }
            break loop1;
        } while (true);
       

        for (int i = text.length()-1; i >=0; i--) {
            
            System.out.printf("%s",text.charAt(i));
        }

        


        

    
                
        
    }
}
