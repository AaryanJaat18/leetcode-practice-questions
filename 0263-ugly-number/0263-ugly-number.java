class Solution {
    public boolean isUgly(int n) {
        if(n<=0)
        return false;
        int[] ugly = {2,3,5};
        for(int num:ugly){
            while(n%num==0){
                n/=num;
            }
        }
        return n==1;
    }
}