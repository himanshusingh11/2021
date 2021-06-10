package Day7;

import java.util.Arrays;

//LeetCode  Move Zeroes
public class Solution {
    public static void main(String[] args) {
        int[] nums = {3,2,0,2,3,5,0};
        int count = 0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }
        }
        for (int i = count; i <nums.length; i++) {
            nums[i]=0;
        }


        System.out.println(Arrays.toString(nums));
    }
}
