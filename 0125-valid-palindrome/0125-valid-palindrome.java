class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder t = new StringBuilder();
        for(int i = 0 ; i < s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                t.append(Character.toLowerCase(c));
            }
        }
        String org = t.toString();
        String rev = new StringBuilder(org).reverse().toString();
        if(org.equals(rev)) return true;
        else return false;
    }
}