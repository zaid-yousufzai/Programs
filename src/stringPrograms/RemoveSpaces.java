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
public class RemoveSpaces {
    
    static String removeSpaces(String str)
    {
//       String noSpace= str.replace(" ","");
//        return noSpace;
        
        String noSpace="";
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
            {
                continue;
            }
            else
            {
                noSpace=noSpace+str.charAt(i);
            }
        }
        
        
        return noSpace;
    }
    
    
    public static void main(String args[])
    {
        String str="     My name is zaid    ";
        System.out.println("String after removing spaces "+removeSpaces(str));    
    }
    
}
