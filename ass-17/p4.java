import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size= sc.nextInt();
		int [][] arr = new int[size][size];
		for(int i =0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		System.out.println(ans(arr));

	}


	static int ans(int[][] arr){
		for(int i =0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<arr.length;i++){
			st.push(i);
			for(int j=0;j<arr.length;j++){
				if(arr[i][j]==1){
					st.pop();
					break;
				}
			}
		}
		int ans=st.pop();
		if(st.isEmpty()){
			return ans;
		}		
		return -1;
	}
}