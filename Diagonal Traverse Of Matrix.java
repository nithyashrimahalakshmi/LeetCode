class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int Row = mat.length; int Col =(mat[0]).length;
        int[] Ele = new int[Row*Col];
        int In = 0; int Ro =0; int Co=0;
        //Ele[0] = mat[0][0];
        boolean Up = true;
        while(In<(Row*Col))
        {
            Ele[In]=mat[Ro][Co];
            In++;
            if(Up)
            {
                
               if(Co==Col-1)
                {
                    Up = false; Ro++;

                }
                else if(Ro==0)
                {
                    Co++; Up = false;
                }
                else
                {
                    Ro--; Co++;
                }
            }
            else
            {
                if(Ro==Row-1)
                {
                    Up = true;
                    Co++;
                }
                else if(Co==0)
                {
                    Ro++; Up = true;

                }
                else
                {
                    Ro++; Co--;
                }
            }

        }
        return Ele;
    }
}
