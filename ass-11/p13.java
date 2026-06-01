import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.print("Enter elements : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		
		int max=0,start=0,end=0,zero=0,one=0,length=0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				length=0;
				zero=0;
				one=0;
				for(int k=i;k<=j;k++){
					if(arr[k]==0){
						zero++;
					}else{
						one++;
					}
					length++;
				}
				if(zero==one){
					max=Math.max(max,length);
					if(length==max){
						start=i;
						end=j;
					}
				}
			}
		} 
		System.out.print(max+"\n");
	}
}