class Solution {
    public int maxSubArray(int[] nums) {

        int Sum = nums[0];
        int St = 0; int In=0;
         int Max = nums[0];
        for(int m=1; m<nums.length; m++)
        {
            Sum = Math.max(nums[m],(Sum+nums[m]));
            Max = Math.max(Max,Sum);

        }
        return Max;
    }
}
