import java.util.Scanner;

public class Algo_9 {
    private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag = false;
        char [] chars;
        String word;
        
        do{
            flag=false;
            System.out.print("Enter a single word: ");
            word = sc.nextLine().strip();
            loop:
            {
                if(word.isBlank()){
                    flag=true;
                    System.out.println("Text can't be blank.");
                    break loop;
                }
            chars = word.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                if(chars[i]==' '){
                    flag=true;
                    System.out.println("Invalid input. Enter a single word.");
                    break;
                }
            }
            }
        }while(flag);

    String reverseStr = "";
    
    int strLength = word.length();

    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + word.charAt(i);
    }

    if (word.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(word + " is a Palindrome String.");
    }
    else {
      System.out.println(word + " is not a Palindrome String.");
    }
  }
}