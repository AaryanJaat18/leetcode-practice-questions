class Solution {
    public int[] runningSum(int[] nums) {
        int [] running_sum = new int[nums.length]; 
        for(int i=0;i<nums.length;i++){
            running_sum[i] = nums[i];
            for(int j=0;j<i;j++){
            running_sum[i] += nums[j];
        }   
        }
        return running_sum;
    }
}