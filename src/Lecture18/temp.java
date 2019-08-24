package Lecture18;
import java.util.*;
public class temp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int arr[] = new int[T];
        for(int i=0;i<T;i++){
            int m = sc.nextInt();
            int n = sc.nextInt();
            sc.nextLine();
            String str1[] = new String[m];
            String str2[] = new String[m];

            for(int j=0;j<m;j++){
                str1[j] = sc.nextLine();
            }
            for(int j=0;j<m;j++){
                str2[j] = sc.nextLine();
            }
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int count = 0;
            for(int j=0;j<m;j++){
                for(int p = 0;p<n;p++){
                    if(str1[j].charAt(p) != str2[j].charAt(p)){
                        count++;
                    }
                    if(str1[j].charAt(p) == '1'){
                        a++;
                    }
                    if(str1[j].charAt(p) == '0'){
                        b++;
                    }
                    if(str2[j].charAt(p) == '1'){
                        c++;
                    }
                    if(str2[j].charAt(p) == '0'){
                        d++;
                    }
                }
            }
            if(a != c || b != d){
                count = -1;
            }
            else{
                count  = count/2;
            }
            arr[i] = count;
        }
        for(int i=0;i<T;i++){
            System.out.println(arr[i]);
        }
    }
    
}