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

//floyd triangle
public class Pattern11 {
    
    static void printPattern(int n)
    {
        int count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count++ +" ");
                
            }
            System.out.println();
        }
    }
    
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the row");
        int n=sc.nextInt();
        printPattern(n);
    }
    
}
