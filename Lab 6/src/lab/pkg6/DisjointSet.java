package lab.pkg6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrahman
 */

interface DisjointSetADT{
    public void makeSet(int capacity);
    public int find(int x);
    public void union(int root1, int root2);
    
}
public class DisjointSet implements DisjointSetADT{

    private int s[];
    public DisjointSet(int size) {
        makeSet(size);
    }

    
    @Override
    public void makeSet(int capacity) {
        s = new int[capacity];
        for(int i=0; i<s.length; i++)
            s[i] = i;
        
    }

    
    @Override
    public int find(int x) {
        if(x<0 && x > s.length)
            throw new IndexOutOfBoundsException("Item not found!");
        if(s[x] == x)
            return x;
        return find(s[x]);
    }

    @Override
    public void union(int root1, int root2) {
        if(find(root1) != find(root2)){
            s[root1] = s[root2];
        }
    }
    
    
    public static void main(String[] args) {
        
        
        DisjointSetADT set = new DisjointSet(10);
        System.out.println(set.find(3));
        System.out.println(set.find(1));
        
        set.union(3, 1);
        
        System.out.println(set.find(3));
        System.out.println(set.find(1));
        
        set.union(1, 4);
        
        System.out.println(set.find(3));
        System.out.println(set.find(4));
        
        System.out.println(set.find(1));
        
        
        /*
        int numInSet = 30;
        int numInSameSet = 14;
        DisjointSetADT set = new DisjointSet(numInSet);
        int s1, s2;
        
        for(int k=1; k<numInSameSet; k*=2)
            for(int j=0; j+k<numInSet; j+=2*k){
                s1 = set.find(j);
                s2 = set.find(j+k);
                set.union(s1, s2);
            }
        
        
        for(int i=0; i<numInSet; i++){
            System.out.print(set.find(i) + " |i = "+i+" | ");
            if(i % numInSameSet == numInSameSet -1){
                System.out.println("");
            }
        }
        */
        
    }
    
}
