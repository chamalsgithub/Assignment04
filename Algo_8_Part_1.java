import java.util.Arrays;

public class Algo_8_Part_1 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        int[] numAIntersectnumBTemp = new int[numA.length];

        int count=0;

        loop1:
        for (int i = 0; i < numA.length; i++) {
            int temp = numA[i];

            loop2:
            for (int j = 0; j < numB.length; j++) {
                if(temp==numB[j]){
                    
                    numAIntersectnumBTemp[count]=temp;
                    count++;
                    continue loop2;
                }
            }
        }

        int[] numAIntersectnumB = new int[count];
        for(int i=0; i<count;i++){
            numAIntersectnumB[i]=numAIntersectnumBTemp[i];
        }

        System.out.println(Arrays.toString(numAIntersectnumB));
    }
}
