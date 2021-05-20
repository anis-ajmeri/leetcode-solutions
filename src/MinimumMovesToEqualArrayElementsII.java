class Solution {
    public int minMoves2(int[] nums) {
        if(nums.length == 1) return 0;
        int diff,minDiff;
        minDiff = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            diff = 0;
            for(int j=0;j<nums.length;j++){
                int res = Math.abs(nums[i]-nums[j]);
                diff +=res;
                if(diff<0) break;
            }
            if(diff >=0 && diff<minDiff) minDiff = diff;
        }     
    return minDiff;        
    }
    
}