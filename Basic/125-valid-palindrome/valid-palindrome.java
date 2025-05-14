class Solution {
    public boolean isPalindrome(String s) {
        boolean isPal=true;
        String input=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int len=input.length();
            for(int i=0;i<len/2;i++){
                if(input.charAt(i)!=input.charAt(len-1-i)){
                    isPal=false;
                }
        }
                
     return isPal;
        
    }
}