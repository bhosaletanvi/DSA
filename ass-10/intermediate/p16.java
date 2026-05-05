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
		int [] temp =new int[size];
		for(int i=1;i<arr.length;i++){
			temp[i]=arr[i-1];
		}	
		temp[0]=arr[arr.length-1];
		for(int i = 0; i<temp.length;i++){
			System.out.print(" "+temp[i]);
		}	
	}
}