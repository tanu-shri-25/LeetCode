class Solution {
    public boolean evenNumber(int i){
        int countDigit=0;
        while(i!=0){
            countDigit++;
            i/=10;
          
        }
        return countDigit%2==0;
    }
    public int findNumbers(int[] nums) {
       int count = 0;
       for(int i =0;i<nums.length;i++){
      //evenNumber(i)  for enchancedforloop
        if(evenNumber(nums[i])){  
            count++;
        }
    

       }
       return count; 
    }
}