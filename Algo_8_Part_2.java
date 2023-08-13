import java.util.Arrays;

public class Algo_8_Part_2 {
    public static void main(String[] args) {
        int[] numA = {5, 7, -2, 3, 4, 6, -8};
        int[] numB = {7, 8, -8, 2, 1, -9, 6};

        int maxLength = numA.length + numB.length;
        int[] union = new int[maxLength];
        int unionSize = 0;

        for (int i = 0; i < numA.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < unionSize; j++) {
                if (numA[i] == union[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                union[unionSize++] = numA[i];
            }
        }

        for (int i = 0; i < numB.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < unionSize; j++) {
                if (numB[i] == union[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                union[unionSize++] = numB[i];
            }
        }

        int[] finalUnion = new int[unionSize];
        for (int i = 0; i < unionSize; i++) {
            finalUnion[i] = union[i];
        }

        
        System.out.println(Arrays.toString(finalUnion));
        
    }
}
