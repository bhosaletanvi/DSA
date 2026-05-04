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
		
		System.out.print("Enter Target : ");
		int target = sc.nextInt();
		System.out.print("ans : "+targetvalue(arr,target));
	}
	
	static int targetvalue(int [] arr,int target){
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				return i;
			}
		}
		return -1;
	}
}