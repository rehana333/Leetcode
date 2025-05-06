class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int actual=x;
        int rev=0,rem;
        while(x!=0){
            rem=x%10;
            rev=rev*10+rem;
            x/=10;

        }
        return rev==actual;
    }
}