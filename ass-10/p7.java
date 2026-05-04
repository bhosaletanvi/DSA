import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		int sum =0;	
		System.out.print("Enter array element : ");
		for(int i = 0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i = 0; i<arr.length;i++){
			sum=sum+arr[i];
		}
		System.out.print("Avrage : "+(sum/arr.length));
	}
}