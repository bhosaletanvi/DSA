import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		System.out.println("Enter String : ");
		sb.append(sc.nextLine());
		for(int i=0;i<sb.length();i++){
			int count=1;
			for(int j=i;j<sb.length()-1;j++){

				if(sb.charAt(j)==sb.charAt(j+1)){
					count++;
				}else if(count>2){
					count-=2;
					sb.delete((j-count+1),j+1);
				}
			}	
		}
		System.out.print(sb);		
	}
}