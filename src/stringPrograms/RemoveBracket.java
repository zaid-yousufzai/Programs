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
public class RemoveBracket {
    
    static String removeBracket(String s)
    {
        String noBracket="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)==')')
            {
                continue;
            }
            else
            {
                noBracket=noBracket+s.charAt(i);
            }
        }
        
        
        
        
        
        return noBracket;
    }
    
    public static void main(String args[])
    {
        String str="“(((a-b))+c)”";
        System.out.println("String after removing brackets "+removeBracket(str));
    }
    
}
