import java.util.Scanner;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.print("\nEnter Elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int [] temp = new int [size];
		int max=0,sum=0,ans=0;
		for(int i=0;i<arr.length;i++){
			max=Math.max(max,arr[i]);
			sum=arr[i]+max;
			ans+=sum;
			temp[i]=ans;
			sum=0;
		}
		for(int i=0;i<temp.length;i++){
			System.out.print(temp[i]+" ");
		}
	}
}