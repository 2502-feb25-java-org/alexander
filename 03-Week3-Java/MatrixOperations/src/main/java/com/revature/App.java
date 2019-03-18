package com.revature;

/**
 * This program process addition and multiplication operations of matrices 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int a[][]={{1,3,4},{3,4,5}};  
        int b[][]={{1,3,4},{3,4,5}};
        int[][] additionResultMatrix = performAddition(a, b);

        int x[][]={{1,1,1},{2,2,2},{3,3,3}};    
        int y[][]={{1,1,1},{2,2,2},{3,3,3}}; 
        int[][] multiplicationResultMatrix = performMultiplication(x, y);

        System.out.println("Addition:");
        printMatrix(additionResultMatrix);
        System.out.println("\nMultiplication:");
        printMatrix(multiplicationResultMatrix);
    }
    
    // Add 2 matrices as a + b.
    public static int[][] performAddition(int a[][], int b[][])
    {
        if (a.length == b.length)
        {
            int[][] resultMatrix = new int[a.length][a[0].length];
            for (int i = 0; i < a.length; i++)
            {
                for (int j = 0; j < b[0].length; j++)
                {
                    resultMatrix[i][j] = a[i][j] + b[i][j];
                }
            }
            return resultMatrix;
        }

        return null;
    }

    // Multiply 2 matrices as x * y.
    public static int[][] performMultiplication(int x[][], int y[][])
    {
        if (x.length == y.length)
        {
            int[][] resultMatrix = new int[x.length][y[0].length];
            for (int i = 0; i < x.length; i++)
            {
                for (int j = 0; j < y[0].length; j++)
                {
                    resultMatrix[i][j] = x[i][j] * y[i][j];
                }
            }
            return resultMatrix;
        }

        return null;
    }

    public static void printMatrix(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
