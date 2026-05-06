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
		int num=0;
		for(int i =0;i<arr.length;i++){
			num=Math.max(num,arr[i]);
		}
		
		for(int i =0;i<arr.length;i++){
			num=Math.min(num,arr[i]);
		}		
		System.out.print(num);
			
	}
}