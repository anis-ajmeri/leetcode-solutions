class Solution {
    public int[] runningSum(int[] nums) {
        int i=1;
        int[] sum = new int[nums.length];
		sum[0] = nums[0];
        while(i<nums.length)
        {
            sum[i] = sum[i-1]+nums[i];
            i++;
        }
        return sum;
    }
}