/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//wap to find the string is palindrome or not

package stringPrograms;

/**
 *
 * @author Hp
 */

import java.util.Scanner;
public class PalindromeString {
    
    static void isPalindrome(String str,int start,int end)
    {
        int count=0;
        while(start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                count++;
            }
            start++;
            end--;
        }
        if(count>0)
        {
            System.out.println("Not a palindrome ");
        }
        else{
            System.out.println("palindrome");
        }
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter the string");
        str=sc.nextLine();
        isPalindrome(str,0,str.length()-1);
    }
    
    
}
