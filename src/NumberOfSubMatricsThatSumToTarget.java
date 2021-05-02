class Solution {
public static void main(String ga[])
{
//int [][]matrix =  {{0,1,0},{1,1,1},{0,1,0}};
//int [][]matrix =  {{1,-1},{-1,1}};
//int [][]matrix =  {{0,0,0,0}};
int [][]matrix = {{0,0,0,1,1},{1,1,1,0,1},{1,1,1,1,0},{0,0,0,1,0},{0,0,0,1,1}};
System.out.println("Count:"+ numSubmatrixSumTarget(matrix,0));
}
    public static int numSubmatrixSumTarget(int[][] matrix, int target) {
      if(matrix.length==0) return 0;
        if(matrix.length==1 && matrix[0].length==1) return matrix[0][0]==target?1:0; 
        int i,j,k,sumHor,sumVertical,count;
        int[][] sumMatrix = new int[matrix.length][matrix[0].length];
        sumMatrix[0][0] = matrix[0][0];
        count = 0;
        i=1;
        while(i<matrix.length)
        {
            sumMatrix[i][0] = sumMatrix[i-1][0]+matrix[i][0];
			System.out.println(sumMatrix[i][0]+" ");
            i++;
        }
        System.out.println();
        j=1;
        while(j<matrix[0].length)
        {
            sumMatrix[0][j] = sumMatrix[0][j-1]+matrix[0][j];
            System.out.print(sumMatrix[0][j]+" ");
			j++;
        }
        System.out.println("\n");	
        sumHor = 0;
        i=1;
        while(i<matrix.length)
        {
            sumHor=matrix[i][0];
            j=1;
            while(j<matrix[0].length)
            {
                sumMatrix[i][j]=sumMatrix[i-1][j]+sumMatrix[i][j-1]-sumMatrix[i-1][j-1]+matrix[i][j];
                sumHor = sumHor + sumMatrix[i][j];
				System.out.print(sumHor+" ");
                if(sumHor==target)count++;
                j++;
            }
			System.out.println();
            i++;
        }
		System.out.println("cc: "+count);
        
        
        i=0;
        while(i<matrix.length)
        {
            j=0;
            while(j<matrix[0].length)
            {
                k=j;
                sumHor = 0;
                while(k<matrix[0].length)
                {
                    sumHor = sumHor + matrix[i][k];
                    if(sumHor==target)count++;
                    k++;
                }
                j++;
            }
            i++;
        }
        
        j=0;
        while(j<matrix[0].length)
        {
            i=0;
            while(i<matrix.length)
            {
                k=i;
                sumVertical = 0;
                while(k<matrix.length)
                {
                    sumVertical = sumVertical + matrix[k][j];
                    if(i!=k && sumVertical==target)count++;
                    k++;
                }
                i++;
            }
            j++;
        }
        return count;
    }
    
}