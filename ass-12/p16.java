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
		int temp=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]%2!=0){
				for(int j=i+1;j<arr.length;j++){
					if(arr[j]%2==0){
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						break;
					}	
				}
			}
		}

		for(int i = 0; i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}
}