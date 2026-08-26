import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size= sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter k : ");
		int k= sc.nextInt();
		int ans[] = new ans(arr,k);
		for(int i=0;i<ans.length;i++){
			System.out.println(" "+ans[i]);
		}
	}


	static int[] ans(int[] arr,int k){
		int ans[] = new int[arr.length-k+1]
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<arr.length-2;i++){
			for(int j=i;j<i+2;j++){
				if(!st.isEmpty() || st.peek()<arr[j]){
					st.pop();
					st.push(arr[i]);
				}
			}
			ans[i]=st.peek();
			st.clear();
		}
	}
}