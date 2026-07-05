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
		System.out.println("Enter totalTrip : ");
		int tp = sc.nextInt();
		System.out.println(totalTrip(arr,tp));
    	}
	static int totalTrip(int [] arr, int tp){
		int time=0,count=0;
		while(count<tp){
			
			for(int i=0;i<arr.length;i++){
				if(arr[i]<=time){
					int digit=time/arr[i];
					count+=digit;
				}else{
					break;
				}
			}
			time++;
		}
		return time-1;		
	}
}