import java.util.Scanner;

public class Algo_1 {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int num;
        
        loop1 :
        do {
            System.out.print("\n Input a positive number ;");
            num = sc.nextInt();
            sc.nextLine();

            if(num<=0) {
                System.out.println( "invalid input");
                continue loop1;
            }

            System.out.print("Fibonacci sequence :");

            int first = 0, second = 1;
            while (first <= num) {
                System.out.print(first + " ");
                int next = first + second;
                first = second;
                second = next;}
         
        } while (true);
    }
}
