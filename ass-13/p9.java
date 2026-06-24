import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[3];
		System.out.print("Enter array element : ");
		for(int i = 0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		boolean flag =true;
		if(arr[0]+arr[1]<arr[2]){
			flag=false;
		}
		else if(arr[1]+arr[2]<arr[0]){
			flag=false;
		}
		else if(arr[2]+arr[0]<arr[1]){
			flag=false;
		}
		HashSet <Integer> hs = new HashSet<>(); 
		if(flag){
			for(int i=0;i<arr.length;i++){
				hs.add(arr[i]);
			}
			if(hs.size()==1){
				System.out.print("equliscale");
			}else if(hs.size()==2){
				System.out.print("isoscale");
			}else{
				System.out.print("scalence");
			}

		}else{
			System.out.print("not a Triangle");
		}
	}
}