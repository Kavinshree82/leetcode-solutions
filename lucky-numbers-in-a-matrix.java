//lucky  number :   minimum element in its row and maximum in its column.
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List <Integer> list = new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int []minInRow = new int[m];
        int []maxInCol = new int[n];

        //minimum in its row
        for(int i=0;i<m;i++)
        {
            int min=matrix[i][0];
            for(int j=1;j<n;j++)
            {
                min=Math.min(min,matrix[i][j]);
            }
            minInRow[i]=min;
        }

        //maximum in its column
        for(int j=0;j<n;j++)
        {
            int max=matrix[0][j];
            for(int i=1;i<m;i++)
            {
                max=Math.max(max,matrix[i][j]);
            }
            maxInCol[j]=max;
        }

        //equal !?
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(minInRow[i]==maxInCol[j])
                {
                    list.add(matrix[i][j]); 
                }
            }
        }

        return list;
    }
}