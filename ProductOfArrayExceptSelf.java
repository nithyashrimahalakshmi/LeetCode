class Solution {
    public int[] productExceptSelf(int[] nums) {
     int[] Pro = new int[nums.length]; int Mul = 1; Pro[0] = 1;
     for(int m=1; m<(nums.length); m++)
     {
        Pro[m]=nums[m-1]*Mul; Mul = Pro[m];
     } int La = 1;
     for(int m=(nums.length-1); m>=0; m--)
     {
        Pro[m]*=La; La*= nums[m];
     }
      return Pro;
    }
}
