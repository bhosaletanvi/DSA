import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array Size : ");
		int size = sc.nextInt();
		int [] arr= new int[size];
		System.out.print("Enter Elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int max=0,maxindex=0;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i]){
				max=arr[i];
				maxindex=i;
			}
		}
		int min=max,minindex=0;
		for(int i=0;i<arr.length;i++){
			if(min>arr[i]){
				min=arr[i];
				minindex=i;
			}
		}

		int leftmin=minindex+1,rightmin=minindex-1-arr.length-1;
		int leftmax=maxindex,rightmax=maxindex-1-arr.length-1;
		int distance=Math.max(minindex,maxindex)-Math.min(minindex,maxindex);
		int ans1=Math.max(leftmax,rightmax);
		int ans2=Math.max(leftmin,rightmin);
		int finalans=0;
		//System.out.println(leftmin+"\n"+leftmax+"\n"+distance+"\n"+ans1+"\n"+ans2+"\n"+ans1+ans2);
		if((ans1+ans2)>distance){
			finalans=Math.min(ans1,ans2)+distance;
		}else{
			finalans=ans1+ans2;
		}
		System.out.print(finalans);
	}
}