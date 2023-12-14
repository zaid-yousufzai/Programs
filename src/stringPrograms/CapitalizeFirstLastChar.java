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
public class CapitalizeFirstLastChar {
    
    static String toCapital(String str)
    {
        str=" "+str+" ";
        String result="";
        char ch;
        
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch==' ')
            {
                
               result=result+ch;
               i++;
               ch=str.charAt(i);
               result=result+Character.toUpperCase(ch);
            }
            
        }
        
        
        
        return result;
    }
    
    
    public static void main(String args[])
    {
        String str="my name is zaid khan";
        System.out.println("String after modification "+toCapital(str));
    }
}
