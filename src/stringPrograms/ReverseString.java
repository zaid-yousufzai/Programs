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
public class ReverseString {
    
    static void reverse(String str)
    {
        String rev="";
        for(int i=str.length()-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }
        System.out.println(rev);
    }
    
    public static void main(String args[])
    {
        String str="Zaid Khan";
        reverse(str);
    }
    
}
