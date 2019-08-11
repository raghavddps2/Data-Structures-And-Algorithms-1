package Lecture17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * UniqueArray
 */
public class UniqueArray {

    public static ArrayList<Integer> makeUnique(int arr[]){

        ArrayList<Integer> al = new ArrayList<Integer>();
        HashMap<Integer,Boolean> unique = new HashMap<Integer,Boolean>();
        for(int i=0;i<arr.length;i++){
            if(!unique.containsKey(arr[i])){
                unique.put(arr[i],true);
                al.add(arr[i]);
            }
        }

        //Method2: Traversing over the Hashmap.
        Set<Integer> keys_list = unique.keySet();
        System.out.println("Keys:");
        for(int x: keys_list){
            System.out.print(x+" ");
        }

        System.out.println();
        return al;
    }
    public static void main(String[] args) {
        

        int arr[] = {1,2,3,4,4,5,6,4,3,2,1,7,8};
        ArrayList<Integer> al = makeUnique(arr);
        for(int i=0;i<al.size();i++){
            System.out.print(al.get(i)+" ");
        }
    }
}