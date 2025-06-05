class Solution {
    public void moveZeroes(int[] nums) {

        int L = nums.length;
       int ZP = L-1;
        int No = 0;
        for(int m=0; m<L;m++)
        {
            if(nums[m]==0)
            {
                No++;

            }
            else if(No>0){
                
                nums[m-No] = nums[m];
                nums[m] = 0;  

            }
        }
        
    }
}
