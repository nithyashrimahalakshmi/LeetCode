class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==1) return 0;
        int Tot = 0;
        for(int m:nums) Tot+=m;
        int LSum = 0;
        for(int m=0; m<nums.length; m++)
        {
            if(LSum==(Tot-LSum-nums[m]))
            {
                return m;
            }
            LSum+=nums[m];
        }
        return -1;

        
    }
}
