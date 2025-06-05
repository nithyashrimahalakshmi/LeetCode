class Solution {
    public int missingNumber(int[] nums) {
        int Sum = nums.length;
        for(int m=0; m<(nums.length); m++)
        {
            Sum+=(m-nums[m]);
        }
        return Sum;


        
    }
}
