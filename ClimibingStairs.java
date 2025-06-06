class Solution {
    public int climbStairs(int n) {
        
        if(n<=2) return n; 
        int M=0; int N=1; int St=2;
        for(int m=2; m<n; m++)
        {
            int C = (M+N); St+=C;
            M=N; N=C;
        }
        return St;
        
    }
}
