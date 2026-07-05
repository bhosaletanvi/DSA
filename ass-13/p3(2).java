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
		int mincount=Integer.MAX_VALUE,count=0,temp=0,time=0,ans=0;
		boolean flag=true;
		for(int j=0;j<arr.length;j++){
			System.out.println(arr[j]+"-----------");
			time=arr[j];
			count=0;
			flag=true;
			//index=0;	
			for(int i=0;i<arr.length;i++){
				if(index==arr.length-1){
					break;
				}else if (i==arr.length){
					//temp=arr[index];
					//count=0;	
					
				}
				temp=time;
				System.out.println(arr[i]+": var");
				if(arr[i]<=time){
					while(temp>0){
						count++;
						temp=temp-arr[i];
						System.out.println(temp+": temp updated"+count);
					if(temp<arr[i]){
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
				System.out.println(mincount);
				ans=time;
			}
			//index++;
			
		}
		return ans;
	}
}