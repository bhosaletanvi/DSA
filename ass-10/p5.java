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
		int odd = 0;
		int even = 0;
		for(int i =0;i<arr.length;i++){
			if(arr[i]%2==0){
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.print(" total Odd Numbers : "+odd+"\n total Even Numbers : "+even);
	}
}