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
		int Secondmax=max(arr,max);	
		System.out.print("Second Max : "+Secondmax);
	
		int min=min(arr,max);
		int Secondmin=min(arr,min);	
		System.out.print("\nSecond min : "+Secondmin);

	}
	static int max(int [] arr,int max){
		int temp=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=max){
				temp=Math.max(temp,arr[i]);
			}
		}
		return temp;
	}

	static int min(int [] arr,int min){
		int temp=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=min){
				temp=Math.min(temp,arr[i]);
			}
		}
		return temp;
	}
	
}