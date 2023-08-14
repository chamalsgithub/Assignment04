import java.util.Scanner;

public class Algo_10 {
     private final static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean flag;

        do{
            System.out.print("Enter your phone number ( formats should be +94 XX XXX XXXX or 0XX-XXXXXXX): ");
            String number = sc.nextLine().strip();

            int length = number.length();
            flag = false;
            char[] chars = number.toCharArray();

            function1:{
           
            if(length==0){
                System.out.println("Input cannot be blank.");
                flag=true;
                break function1;
                
            }

            else if(length==15 && chars[0]=='+' && chars[1]=='9' && chars[2]=='4' && 
            chars[3]==' ' && chars[4]<='9' && chars[4]>='0' && chars[5]<='9' && chars[5]>='0' && 
            chars[6]==' ' && chars[7]<='9' && chars[7]>='0' && chars[8]<='9' && chars[8]>='0' &&
             chars[9]<='9' && chars[9]>='0' && chars[10]==' ' &&  chars[11]<='9' && chars[11]>='0' && 
             chars[12]<='9' && chars[12]>='0' && chars[13]<='9' && chars[13]>='0' && chars[14]<='9' && chars[14]>='0'){
                System.out.println("Number is validated");
                break function1;

            }

            else if(length==11 && chars[0]=='0' && chars[1]<='9' && chars[1]>='0' && chars[2]<='9' && chars[2]>='0' && 
            chars[3]=='-' && chars[4]<='9' && chars[4]>='0'  && chars[5]<='9' && chars[5]>='0' && chars[6]<='9' && 
            chars[6]>='0' && chars[7]<='9' && chars[7]>='0' && chars[8]<='9' && chars[8]>='0' && chars[9]<='9' && chars[9]>='0' && 
            chars[10]<='9' && chars[10]>='0'){
                System.out.println("Number is validated");
                break function1;
            }

            else{
                System.out.println("Invalid phone number");
                flag=true;
            }

            }


        }while(flag);
    }
}