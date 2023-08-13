import java.util.Scanner;

public class Algo_7 {
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
        String shortest = words[0];
        String longest = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortest.length()) {
                shortest = words[i];
            }
        }

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }

        System.out.printf("Shortest word is : %s \nLongest word is: %s \n", shortest ,longest);       


    }
}
