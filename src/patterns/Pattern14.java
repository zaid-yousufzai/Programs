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
public class Pattern14 {
    
    static void printPattern(int n)
    {
      for(int i=1;i<=n;i++)
      {
          
          for(int k=i;k<n;k++)
          {
              System.out.print(" ");
          }
          for(int j=1;j<=i;j++)
          {
              System.out.print(i+" ");       
          }
           System.out.println();
      }
     
    }
    
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows");
        int n=sc.nextInt();
        printPattern(n);
        
        
    }
    
}
