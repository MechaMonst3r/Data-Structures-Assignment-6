/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mrahman
 */


interface HashADT<K, V>{
    public void set(K key, V value);
    public V get(K key);
    public int size();
    public boolean contains(K key);
    public boolean contains(K key, V vlaue);
    
}

public class HashTable<K, V> implements HashADT<K, V>{

    private V bucket[]; 
    private int size;

    public HashTable(int capacity) {
        bucket = (V[]) new Object[capacity];
        size = 0;
    }
    
    private int hash(K key){
        //return key.toString().length();
        int code = 0;
        String skey = key.toString();
        for(int i=0; i<skey.length(); i++)
            code+=skey.charAt(i);
        
        return code;
    }
    
    private int getIndex(K key){
        int hashcode = hash(key);
        return hashcode % bucket.length;
    }

    @Override
    public void set(K key, V value) {
        int index = getIndex(key);
        System.out.println("Hash Index:"+index);
        if(bucket[index] == null){
            bucket[index] = value;
            size++;
            
        } //else implement linear cyclic list
    }

    @Override
    public V get(K key) {
        int index = getIndex(key);
        if(bucket[index] == null)
            throw new IndexOutOfBoundsException("Object not found!");
        return bucket[index];
    }
    
    

    @Override
    public int size() {
       return size;
    }

    @Override
    public boolean contains(Object key) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object key, Object vlaue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void main(String[] args) {
        HashADT h = new HashTable<String, String>(40);
        h.set("this2", "that");
        h.set("is", "TRU");
        h.set("test123456", "Canada");
        
        System.out.println(h.size());
        
        System.out.println(h.get("test123456"));
        System.out.println(h.get("this2"));
        
        

    }
    
    

    
    
}