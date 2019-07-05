package Lecture8;

public class LinearSearchRec{

    public static boolean myCheckFunc(int input[],int x,int si){
            
        if(si == input.length){
            return false;
        }
        
        myCheckFunc(input,x,si);
        if(input[si-1] == x){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){

        int input[] = {1,2,3,4,5};
        int key = 3;
        boolean res = myCheckFunc(input,key,1);
        System.out.println(res);
    }
}