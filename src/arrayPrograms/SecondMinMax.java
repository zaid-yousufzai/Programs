/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//find the second largest and the second smallest
package arrayPrograms;

/**
 *
 * @author Hp
 */
public class SecondMinMax {
    
    
    static int smallest(int a[],int n)
    {
        if(n<2)
        {
            return -1;
        }
        int smallest=Integer.MAX_VALUE;
        int secondsmallest=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++)
        {
            if(a[i]<smallest)
            {
                secondsmallest=smallest;
                smallest=a[i];
            }
            else if(a[i]<secondsmallest && a[i]!=smallest)
            {
                secondsmallest=a[i];
            }
        }
        return secondsmallest;
    }
    
    static int largest(int a[],int n)
    {
        
        if(n<2)
        {
            return -1;
        }
        
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++)
        {
            if(a[i]>largest)
            {
                secondlargest=largest;
                largest=a[i];
            }
            
            else if(a[i]>secondlargest && a[i]!=largest)
            {
                secondlargest=a[i];
            }
        }
        return secondlargest;
    }
    
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int n=a.length;
        System.out.println("Second smallest element is "+smallest(a,n));
         System.out.println("Second largest element is "+largest(a,n));
    }
}
