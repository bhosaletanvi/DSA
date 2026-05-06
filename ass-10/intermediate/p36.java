import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter array size : ");
		int size = sc.nextInt();
		int [] arr= new int[size];
		System.out.print("Enter array elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int even_sum=0,odd_sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				even_sum+=arr[i];
			}
			else{
				odd_sum+=arr[i];
			}
		}
		System.out.print("Even Sum : "+even_sum+"\nOdd sum : "+odd_sum);	
	}
}