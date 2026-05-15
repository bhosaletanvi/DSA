import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.print("Enter array element : ");
		for(int i = 0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int max=max(arr,0);
		int ans1=max(arr,max);	
	}
	static int max(int [] arr,int max){
		int temp=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=max){
				max=Math.max(temp,arr[i]);
			}
		}
		return max;
	}

	
}