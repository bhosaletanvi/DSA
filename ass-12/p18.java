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

		System.out.print(signfun(arr));
	}
	static int signfun(int [] arr){
		int negativecount=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<0){
				negativecount++;
			}else if(arr[i]==0){
				return 0;
			}
		}
		if(negativecount%2==0){
			return 1;
		}
		return -1;
	}
}