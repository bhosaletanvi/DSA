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
		int positive =0;
		int negative =0;
		int zero=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				positive++;
			}
			else if(arr[i]<0){
				negative++;
			}
			else{
				zero++;
			}
		}
		System.out.print("Positive : "+positive+"\nNegative : "+negative+"\nZero : "+zero);	
	}
}