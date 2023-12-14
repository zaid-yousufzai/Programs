/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Find the smallest element in an array

package arrayPrograms;

/**
 *
 * @author Hp
 */

public class SmallestElement {
    
    static void display(int a[])
    {
        System.out.println("Array is ");
        for(int i=0; i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
    static int smallest(int a[])
    {
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
        }
        System.out.println("smallest element is ");
        return min;
    }
    
    public static void main(String args[])
    {
        
        int a[]={4,5,2,7,12,56,87,9,67,45,23,48};
        
        display(a);
       System.out.println(smallest(a));
        
        
    }
    
}
