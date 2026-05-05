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
		System.out.print(sortedOrNot(arr));
		
	}
	static boolean sortedOrNot(int [] arr){
			int i =0;		
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					return false;
				}
				i++;
			}
		
		return true;
	}		
	
}