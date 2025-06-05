class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> L = new ArrayList<Integer>();
        int Le = 0; int Ri = (matrix[0].length)-1;
        int To = 0; int Bo = matrix.length-1;

        while(To<=Bo && Le<=Ri)
        {
            for(int m=Le; m<=Ri; m++)
            {
                L.add(matrix[To][m]);
                
            }
            To++;
            for(int m=To; m<=Bo; m++)
            {
                L.add(matrix[m][Ri]);
            }
            Ri--;
            if(To<=Bo){
            for(int m=Ri; m>=Le; m--)
            {
                L.add(matrix[Bo][m]);
            }
            Bo--;}
            if(Le<=Ri){
            for(int m=Bo; m>=To; m--)
            {
                L.add(matrix[m][Le]);
            }
            Le++;}
        } 
        return L;

    }
}
