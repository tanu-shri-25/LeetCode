class Solution {
    public int maxSubArray(int[] nums) {
        int maxx=nums[0];
        int current = 0;
        for(int num : nums){
            current+=num;
            maxx = Math.max(current , maxx);
            if(current<0){
                current = 0;
            }

        }
        return maxx;
    }
}