class Solution {
    public boolean isHappy(int n) {
        if (n == 1)
            return true;
        if (n == 4)
            return false;
        int temp = 0;
        while (n > 0) {
            int digit = n % 10;
            temp += digit * digit;
            n /= 10;
        }
        return isHappy(temp);
    }
}