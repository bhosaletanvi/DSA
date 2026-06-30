import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size = sc.nextInt();
		int [] arr= new int[size];
		System.out.println("Enter elements : ");	
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(rabbits(arr));
	}
	 static int rabbits(int[] arr) {
        int sum=0,count=0;
        boolean []visited = new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(!visited[i] && arr[i]!=0){
                count=0;
                for(int j=i+1;j<arr.length;j++){
		    if(count>=arr[i]){
                        break;
                    }
                    if(arr[i]==arr[j]){
                        visited[j]=true;
                        count++;
                    }
                }
                sum+=(Math.max(arr[i],count)-Math.min(arr[i],count));
		System.out.println(arr[i]+"  "+sum);
            }
        }
        return (sum+arr.length);
    }
}