class Solution {
    public int countDigits(int num) {
        int count=0;
        int toCheck=num;
        while(num>0){
            int digit=num%10;
            if(toCheck%digit==0){
                count++;
            }
            num/=10;
        }
        return count;
    }
}