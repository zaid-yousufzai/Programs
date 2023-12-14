/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package stringPrograms;

/**
 *
 * @author Hp
 */
public class SumStringNumbers {
    
    static int sumNum(String str)
    {
        int sum=0;
        String temp="0";
        
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isDigit(ch))
            {
                temp=temp+ch;
            }
            else
            {
                sum=sum+Integer.parseInt(temp);
                temp="0";
            }
        }
        
        return sum+Integer.parseInt(temp);  // here this code is written if the digit are at the last of the string so to add those number we have to add here
    }
    
    
    
    public static void main(String args[])
    {
        String str="1bc268";
        
        System.out.println("sum of the numbers in the strring is "+ sumNum(str));
    }
    
}
