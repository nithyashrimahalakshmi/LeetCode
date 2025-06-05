class Solution {
    public String longestCommonPrefix(String[] strs) {
     
     if(strs.length==0 || strs==null) return "";
     else
     {
        
        for(int m=0; m<(strs[0].length()); m++)
        {
            for(int n=1; n<(strs.length); n++)
            {
                if((m>=(strs[n].length())) || (strs[n].charAt(m)!=strs[0].charAt(m)))
                {
                    return strs[0].substring(0,m);
                }
            }
        }
        return strs[0];

     }
     


     


    }
}
