import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.print("Enter array element : ");
		for(int i = 0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Elements at even indices:");
		for(int i =0;i<arr.length;i=i+2){
			System.out.print(" "+arr[i]);
		}

		System.out.print("\nElements at Odd indices:");
		for(int i =1;i<arr.length;i=i+2){
			System.out.print(" "+arr[i]);
		}		
	}
}