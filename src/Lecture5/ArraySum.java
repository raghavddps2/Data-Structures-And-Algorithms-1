package Lecture5;
import java.util.Scanner;
public class ArraySum {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter value of n:\t");
			int n = sc.nextInt();
			int sum =0;
			int []arr = new int[n];
			System.out.println("Enter the array elements");
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			System.out.println("The sum of the elements of array is: "+sum);
			sc.close();
		}
}
