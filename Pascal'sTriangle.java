class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Tri = new ArrayList<>();

        for(int m=0; m<numRows; m++)
        {
            List<Integer> Row = new ArrayList<>();
            for(int n=0; n<=m; n++)
            {
                if(n==0 || m==n)
                {
                    Row.add(1);
                }
                else
                {
                    int M = (Tri.get(m-1).get(n-1))+(Tri.get(m-1).get(n));
                    Row.add(M);
                }
            }
                Tri.add(Row);
            
        }
        
        return Tri;
    }
}
