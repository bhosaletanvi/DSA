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
		int max=maximum_num(arr);
		int min=minimum_num(arr);
		System.out.print(" Maximum Number : "+max+"\n Minimum Number : "+min);
	}
	static int maximum_num(int [] arr){
		int max=0;
		for(int i=0;i<arr.length;i++){
			max=Math.max(max,arr[i]);
		}
		return max;
	}

	static int minimum_num(int [] arr){
		int max=0;
		for(int i=0;i<arr.length;i++){
			max=Math.max(max,arr[i]);
		}

		int min=max;
		for(int i=0;i<arr.length;i++){
			min=Math.min(min,arr[i]);
		}
		return min;
	}

}