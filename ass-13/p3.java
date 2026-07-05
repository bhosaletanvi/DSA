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
		 long mincount=Integer.MAX_VALUE,count=0,temp=0,time=1,ans=0;
		while(count<tp){
			count=0;
			for(int i=0;i<arr.length;i++){
				temp=time;
				if(arr[i]<=time){
					while(temp>0){
						count++;
						temp-=arr[i];
						if(temp-arr[i]<0){
							break;	
						}
					}
				}
			}
			time++;

		} 
		return time-1;
	
	}
}