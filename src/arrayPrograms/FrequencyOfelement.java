/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//find frequency of each elements in an array

package arrayPrograms;

/**
 *
 * @author Hp
 */

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfelement {
    
    static void frequencyElement(int a[])
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i], map.get(a[i])+1);
            }
            else
            {
                map.put(a[i],1);
            }
        }
        
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        
        
    }
    
    
    public static void main(String args[])
    {
        
        int a[]={1, 2, 3, 4, 1, 2, 2, 3, 5, 4, 1};
       
        frequencyElement(a);
    }
    
    
}
