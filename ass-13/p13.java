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
		HashMap<Integer,Integer> hm = new HashMap<>();
		int max= Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
			max=Math.max(arr[i],max);
		}
		boolean flag=true;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=max){
				if(hm.get(arr[i])!=1){
					flag=false;
					break;
				}
			}else if(arr[i]==max){
				if(hm.get(arr[i])!=2){
					flag=false;
					break;
				}
			}
		}
		System.out.print(flag);
	}
}