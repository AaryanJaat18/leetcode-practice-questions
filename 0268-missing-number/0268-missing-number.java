class Solution {
    public int missingNumber(int[] nums) {
        int actual_sum = 0;
        int sum = 0;
        int output ;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=1;i<=nums.length;i++){
            actual_sum+=i;
        }
        return output = actual_sum-sum;
    }
}