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
		System.out.println("Enter distance : ");
		int dist = sc.nextInt();
		int pos=0,count=0;
		if(arr[0]>dist){
			while(pos<arr[0]-dist){
				pos+=dist;
				count++;
			}
		}
		for(int i=0;i<arr.length-1;i++){
			while(arr[i+1]-arr[i]>dist){
				arr[i]+=dist;
				count++;
			}
		}
		System.out.println(count);
	}
}