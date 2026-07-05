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
		int mincount=Integer.MAX_VALUE,count=0,temp=0,time=1,ans=0;
		while(count<tp){
			count=0;
			flag=true;
			for(int i=0;i<arr.length;i++){
				temp=arr[i];
				if(arr[i]<=time){
					while(temp>0){
						count++;
						temp-=arr[i];
						if(arr[i]-temp<0){
							break;	
						}
					}
				}else{
					flag=false;
					break;
				}
			}
			if(flag && count>=tp){
				mincount=Math.min(mincount,count);
				ans=time;
				
			}
			time++;

		} 	
	}
}