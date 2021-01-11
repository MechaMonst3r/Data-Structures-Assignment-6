/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author work
 */
public class Lab6 {

    
//Removes duplicate chracters from an array to display.    
public static void removeDuplicate(char arr[], int j)
{
 HashTable<Character, Boolean> table = new HashTable<Character, Boolean>(j);//Hashtable to store char's
 
 //Scans through the provided array
 for(int i = 0; i < j; i++)
   {
    try
      {   
       if(table.get(arr[i]) == null)//If there is nothing in that spot of the hashtable
         {
          System.out.print(arr[i] + "");
         }
       }
    
    catch(Exception IndexOutOfBoundsException)
       {
        System.out.print(arr[i] + "");//Prints the element to the screen.
       }
     
     table.set(arr[i], true);//Stores the element in the hashtable.
   } 
}

 public static void symmetricPair(List list)
   {
    int i = 0;
    HashTable<Integer, Integer> table = new HashTable<Integer, Integer>(40);
    
    while(list.get(i) != null)
        {
          Pair temp = (Pair)list.get(i);
          if(table.set((Integer)temp.getKey())) == table.hash((Integer)temp.getValue()))
            {
                
            }
        }
   
       
   }
    public static void main(String[] args) {
        
        char[] test = {'a','a','a','b','b','b','c','c','c'};
        removeDuplicate(test, test.length);
        
        Pair<Integer, Integer> a = new Pair<Integer, Integer>(3,4);
        Pair<Integer, Integer> b = new Pair<Integer, Integer>(4,3);
        Pair<Integer, Integer> c = new Pair<Integer, Integer>(6,7);
        Pair<Integer, Integer> d = new Pair<Integer, Integer>(9,10);
        Pair<Integer, Integer> e = new Pair<Integer, Integer>(34,46);
        Pair<Integer, Integer> f = new Pair<Integer, Integer>(46,34);
        
        List list = new LinkedList();
        
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        list.add(f);
    }
    
}
