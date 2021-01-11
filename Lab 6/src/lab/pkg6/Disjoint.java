package lab.pkg6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author work
 */
public class Disjoint implements DisjointSetADT {

    private int s[];
    private int arr[];
    public Disjoint(int size) {
        makeSet(size);
    }

    
    @Override
    public void makeSet(int capacity) {
        s = new int[capacity];
        for(int i=0; i<s.length; i++)
        {   
            s[i] = i;
        }
    }

    
    @Override
    public int find(int x) {
        if(x<0 && x > s.length)
            throw new IndexOutOfBoundsException("Item not found!");
        if(s[x] == x)
            return x;
        return find(s[x]);
    }
    
    //Finds parent of current element until it hits the root.
    public int root(int i) 
    { 
      while(s[i] != i)
      {
        i = s[i];  
      }  
      return i;  
    }

    @Override
    public void union(int root1, int root2) {
        
        //Finds the root of both passed paremeters.
        int rootA = root(root1);
        int rootB = root(root2);
        
        //If the first Root is less then then second root.
        if(rootA < rootB)
          {
           s[rootA] = s[rootB];//Makes the second root a child of the first.
          }
        
        else
         s[rootB] = s[rootA];//Else it will make the first root the child of the first.
    }
    
}
