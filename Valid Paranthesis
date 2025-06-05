class Solution {
    public boolean isValid(String s) {

        String Le = "[{("; 
        int L = s.length();
        char Par[] = new char[L];
        int Ri=0;
        int In = 0;
        for(int m=0; m<L; m++)
        {
            if(Le.indexOf(s.charAt(m))>-1)
            {
                Par[In]=s.charAt(m);
                In++;
            }
            else
            {
                if(In==0) return false;
                else
                {
                if((s.charAt(m)==')' && Par[In-1]=='(')||(s.charAt(m)==']' && Par[In-1]=='[')||(s.charAt(m)=='}' && Par[In-1]=='{'))
                {
                    In--; Ri--;
                }
                else
                {
                    return false;
                }
                }
            }

        }
          if(In==0)
          {
           return true;
          }
          else return false; 
        
        
        
    }
}
