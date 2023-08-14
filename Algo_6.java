
import java.util.Scanner;

public class Algo_6 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       String sentence;
        
        loop1:
        do {
            
            System.out.print("Enter enter a sentence (ASCII only) :");
            sentence = sc.nextLine();
            
            if(sentence.isBlank()){
                System.out.println("Invalid input");
                continue loop1;
            }
            break loop1;
        } while (true);

        String[] words = sentence.split("\\s+");
        StringBuilder reversed = new StringBuilder();
            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]);
                if (i > 0) {
                    reversed.append(" ");
                }
            }
        System.out.println(reversed); 
/* 
        loop:
        do {
            System.out.println("Enter a text");
         char[] chars = sc.nextLine().strip().toCharArray();
         if(chars.length==0){
            System.out.println("Text cant be empty");
            continue;
         }
            int wordcount=1;
            

         for (int i = 0; i < chars.length; i++) {
            if (chars[i]>128){System.out.println("Only ASCII characters are supported");}
            continue loop;

            if(chars[i]==' ')wordcount++;
         }}

         String 
            
        } while (true);
*/
    
    }
}
