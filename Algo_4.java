import java.util.Arrays;

public class Algo_4 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50,60,70,80,90}; 

        for (int i = 0; i < nums.length-3; i++) {
            int temp;
            temp=nums[i];
            nums[i]=nums[nums.length-1-i];
            nums[nums.length-1-i]=temp;
            
        }

        System.out.println(Arrays.toString(nums));
    }
}
