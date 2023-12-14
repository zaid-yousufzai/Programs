/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package patterns;
import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class Pattern4 {
    
    static void printPattern(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");    //for printing the upper triangle
            }
            System.out.println();
            
        }
        
        
        for(int i=1;i<n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
    
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        printPattern(n);
    }
    
}
