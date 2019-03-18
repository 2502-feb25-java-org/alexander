package com.revature;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
 
/**
 * 
 * 
 * This program reads ingredients.txt file and displays to the consolde the ingredient list to make a sandwhich.
 *
 */
public class Sandwhich 
{
    public static void main( String[] args ) throws IOException
    {
        File file = new File("C:\\Java\\JavaLearning\\alexander\\03-Week3-Java\\Ingredients\\src\\main\\java\\com\\revature\\ingredients.txt");
        FileInputStream in = new FileInputStream(file);

        try {
            int ingr; 
            StringBuilder strBldr = new StringBuilder();
        
            while ((ingr = in.read()) != -1) {
                strBldr.append((char) ingr);
            }

            String[] ingredients = strBldr.toString().split(" ");

            System.out.print("The ingredients to make a sandwhich: ");

            for (int i = 0; i < ingredients.length; i++) {
                System.out.print(ingredients[i]);
                if (i < ingredients.length - 1) {
                    System.out.print(", ");
                }
            }

        }
        finally {
            if (in != null) {
                in.close();
            }
        }
    }
}
