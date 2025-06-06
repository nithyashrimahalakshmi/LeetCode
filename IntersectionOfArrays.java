class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> M = new HashSet<>(); Set<Integer> N = new HashSet<>();
        for(int m=0; m<nums1.length; m++)
        {
            M.add(nums1[m]);
        }
        for(int n=0; n<nums2.length; n++)
        {
            if(M.contains(nums2[n]))
            {
                N.add(nums2[n]);
            }
        }
        int I = 0;
        int[] Int = new int[N.size()];
        for(int m:N)
        {
            Int[I]=m; I++;
        }
        return Int;
        
    }
}
