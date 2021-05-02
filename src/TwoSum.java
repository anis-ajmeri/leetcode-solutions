class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        i=0;
        while(i<nums.length-1)
        {
            j=i+1;
            while(j<nums.length)
            {
                if(nums[i]+nums[j]==target)
                    return new int[]{i,j};
                j++;
            }
            
            i++;
        }
        return new int[]{-1,-1};
        
    }
}