package Lecture11.Generics;

/**
 * Pair
 */
public class Pair<T> {

    T data1;
    T data2;
    public T getData1(){
        return this.data1;
    }
    public T getData2(){
        return this.data2;
    }
}