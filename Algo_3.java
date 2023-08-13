import java.util.Arrays;

public class Algo_3 {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50}; 

        int[] numsTemp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            numsTemp[i]=nums[nums.length-1-i];
        }
        nums=numsTemp;

        
        System.out.println(Arrays.toString(nums));
    }
}