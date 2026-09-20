class Solution {
    public int maximumDifference(int[] nums) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = -1;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]>minprice){
                maxprofit = Math.max(maxprofit,nums[i]- minprice);
                }
                minprice = Math.min(minprice,nums[i]);
        }
   
        return maxprofit;
    }
}