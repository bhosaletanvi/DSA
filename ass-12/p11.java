import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter String : ");
		sb.append(sc.nextLine());
		int end=0,start=0,temp=0;
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)=='0'){
				start=i;
				temp=start;
				while(temp<sb.length() && sb.charAt(temp)=='0'){
					end=temp;
					temp++;
				}
				if(start!=end){
					sb.delete(start,end+1);
				}

			}
		}
		System.out.print(sb);
	}
}