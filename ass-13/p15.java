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
		System.out.print(evenMax(arr));
	}
		
	static int evenMax(int [] arr){
		int temp=0;
		HashMap<Integer,Integer> hm = new HashMap<>();
		for(int i=0;i<arr.length;i++){
			hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
			
		}
		if(hm.size()==0){
			return -1;
		}
		int max=Integer.MIN_VALUE,ans=0,min=Integer.MAX_VALUE;
		for(Integer key : hm.keySet()){
			if(hm.get(key)>max || min>key){
				max=hm.get(key);
				ans=key;
				
			}
		}
		return ans;
	}
}