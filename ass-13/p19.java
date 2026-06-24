import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s = sc.next();
		StringBuilder sb = new StringBuilder(s);
		int max=Integer.MIN_VALUE,maxindex=0,firstmax=0,ans=0;
		for(int j=1;j<=2;j++){
			 max=Integer.MIN_VALUE;
			for(int i=0;i<sb.length();i++){
				if(sb.charAt(i)>=47 && sb.charAt(i)<=58){
					if(sb.charAt(i)>max){
						max=sb.charAt(i);
						maxindex=i;	
					}
				}
				if(firstmax==max){
					ans=-1;
					break;
				}
			}
			firstmax=max;
			sb.setCharAt(maxindex,'*');
		}
		System.out.println((char)max);		
	}
}