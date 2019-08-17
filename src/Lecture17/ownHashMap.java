package Lecture17;
import java.util.*;

class Pair<K,V>{
    K Key;
    V Value;
    Pair<K,V> next;
    Pair<K,V> head;
    Pair<K,V> tail;
}

public class ownHashMap<K,V> {
    ArrayList<Pair<K,V>> hashtable;
    int size;
    ownHashMap<K,V>(){
        hashtable = new ArrayList<Pair<K,V>>(11);
        for(int i=0;i<11;i++){
            hashtable.add(null);
        }
        size = 0;
    }

    int getSize(){
        return size;
    }
    boolean isEmpty(){
        return size == 0;
    }
    int hashFunc(K key){
        //calculate hash code.
        int x = ;
        //cpmress and give final index.
        return y;
    }
    void insert(K key, V value){
        int index = hasFunc(key);
        if(hashtable.get(K) == null){
            Pair<K,V> temp = hashtable.get(key);
            tail = temp;
            head = temp;
        }
        else{
            Pair<K,V> temp = hashtable.get(key);
            tail.next = temp;
            tail = temp;    
        }
    }
}