class Solution {
    public int maximumDifference(int[] nums) {
        int Min = nums[0]; int MaxDif=-1;
        for(int m=1; m<nums.length; m++)
        {
            if(nums[m]>Min)
            {
                MaxDif = ((nums[m]-Min)>MaxDif)?(nums[m]-Min):MaxDif;
            }
            else
            {
                Min = nums[m];
            }
        }
        return MaxDif;

        
    }
}
