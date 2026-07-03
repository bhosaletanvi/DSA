import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size = sc.nextInt();
		int [][] arr= new int[size][size];
		System.out.println("Enter elements : ");	
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter k : ");
		int k = sc.nextInt();
		int sum=0;
		int[][] ans = new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				int top=i-k,bottom=i+k,left=j-k,right=j+k;
				//System.out.println(left+" "+top+" "+right+" "+bottom);

				if(top<=0){
					top=0;
				}
				if(left<=0){
					left=0;
				}
				if(bottom>=size){
					bottom=size-1;
				}
				if(right>=size){
					right=size-1;
				}
				//System.out.println(left+" "+top+" "+right+" "+bottom);

				for(int m=top;m<=bottom;m++){
					for(int n=left;n<=right;n++){
						sum+=arr[m][n];
					}
				}
				//System.out.println(i+" "+j+" "+sum);

				ans[i][j]=sum;
				sum=0;
			}
		}
		for(int i=0;i<ans.length;i++){
			for(int j=0;j<ans.length;j++){
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
}
	
}