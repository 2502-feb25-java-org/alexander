package main;

/**
 * Program that searches for the greatest of three numbers using Short-circuit Operators and prints the result. 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        printGreatestNumber(2, 5, 8);
        printGreatestNumber(2, 6, -1);
        printGreatestNumber(-7, -9, -8);
    }

    public static void printGreatestNumber(int num1, int num2, int num3)
    {
        int greatest = num1;

        if (num1 >= num2)
        {
            greatest = num1;
        }
        if (num2 >= num3) {
            greatest = num2;
        }
        if (num3 >= num1) 
        {
            greatest = num3;
        }
        
        System.out.println("Greatest number out of " + num1 + " " + num2 + " " + num3 + " is: " + greatest);
    }
}
