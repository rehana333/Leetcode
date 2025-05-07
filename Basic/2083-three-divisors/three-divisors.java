import java.util.ArrayList;
class Solution {
    public boolean isThree(int n) {
        ArrayList<Integer> divisors=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                divisors.add(i);
                if(i!= n/i){
                    divisors.add(n/i);
                }
            }


        }
        return divisors.size()==3;
    }
}