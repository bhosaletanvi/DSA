import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		
		System.out.println("Enter elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int first=MaxNo(arr,0);
		int second=MaxNo(arr,first);
		int third=MaxNo(arr,second);
		if(third==Integer.MIN_VALUE || third==second){
			System.out.print(first);
		}else{
			System.out.println(third);
		}		
	}
	static int MaxNo(int [] arr, int num){
		int maxindex=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				maxindex=i;
				max=arr[i];
			}
		}
		arr[maxindex]=Integer.MIN_VALUE;
		return max;
	}
}