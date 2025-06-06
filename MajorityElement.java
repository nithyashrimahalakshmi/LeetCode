class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> Fre = new HashMap<>();
        for(int m=0; m<nums.length; m++)
        {
            Fre.put(nums[m],Fre.getOrDefault(nums[m],0)+1);
            if(Fre.get(nums[m])>(nums.length/2)) return nums[m];

        }
    
    return 0;
    }
}
