class Solution {
    public boolean containsDuplicate(int[] nums) {
     Arrays.sort(nums);
     for(int m=1; m<nums.length; m++)
     {
        if(nums[m-1]==nums[m]) return true;
     }
     return false;


    }
}
