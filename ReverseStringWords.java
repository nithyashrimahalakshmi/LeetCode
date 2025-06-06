    class Solution {
        public String reverseWords(String s) {
            String Ret = "";
            String[] Words = s.trim().split("\\s+");
            int L = Words.length;
            for(int m=(L-1); m>=0; m--)
            {
                Ret+=Words[m];

                if(m>0)
                {
                    Ret+=" ";
                }
            }

            return Ret;
        }
    }
