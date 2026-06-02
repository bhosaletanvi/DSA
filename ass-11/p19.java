import java.util.Scanner;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Array : ");
		int size = sc.nextInt();
		System.out.print("Enter Target : ");
		int target = sc.nextInt();
		int [] arr = new int[size];
		System.out.print("Enter Elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int [] ans={-1,-1};
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				ans[0]=i;
				break;
			}
		}
		for(int i=arr.length-1;i>=0;i--){
			if(arr[i]==target){
				ans[1]=i;
				break;
			}
		}
		Systen.out.println();
		for(int i=0;i<ans.length;i++){
			System.out.print(ans[i]+" ");
		}

	}
}