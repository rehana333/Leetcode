class Solution {
    public int majorityElement(int[] nums) {
        //taking first element 
        int ele=nums[0];
        int count=0;
        for(int num :nums){
            //if count becomes 0 then updating the element 'ele' with another value 'num'
            if(count==0){
                ele=num;
            }
            //if current element is equal to ele then increment count else decrement
            count+=(num==ele)?1:-1;
        }
        return ele;
    }
}