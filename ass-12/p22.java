import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int size = sc.nextInt();
		String [] s= new String[size];
		System.out.println("Enter Strings : ");	
		for(int i=0;i<s.length;i++){
			s[i]=sc.next();
		}
		System.out.println("Enter Dictionary : ");
		String order = sc.next();
		boolean flag = true;
		for(int i=0;i<s.length-1;i++){
			if(s[i].length()>s[i+1].length()){
				flag=false;
			}else{
				for(int j=0;j<s[i].length();j++){
					if(order.indexOf(s[i].charAt(j))<order.indexOf(s[i+1].charAt(j))){
						flag=true;
						break;
					}else if(order.indexOf(s[i].charAt(j))==order.indexOf(s[i+1].charAt(j))){
						continue;
					}
					else{
						flag=false;
						break;
					}
				}
			}
			if(!flag){
				break;
			}
		}
		System.out.println(flag);
	}
}