package Day3;

public class FindDuplicatesLeetCode {
    class Solution {
        public int findDuplicate(int[] nums) {
            int ans = 0;
            for(int i =0; i<nums.length; i++){
                int count = 0;

                for(int j = i+1;j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        count++;
                        ans = nums[i];
                    }
                }
            }
            return ans;


        }
    }
}
