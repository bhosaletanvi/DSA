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
		System.out.print("Enter Target  : ");
		int target = sc.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				count++;
			}
		}
		System.out.print(count);
			
	}
}