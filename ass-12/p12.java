import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter  Size : ");
		int size = sc.nextInt();
		sc.nextLine();

		String [] s= new String[size];
		System.out.print("Enter String : ");
		for(int i=0;i<s.length;i++){
			s[i] = sc.nextLine();
		}
		boolean flag=true;
		int index=1;
		for(int i=0;i<s[0].length();i++){
			while(index<s.length){
				if(flag){
					flag=false;
					for(int j=0;j<s[index].length();j++){
						if(s[0].charAt(i)==s[index].charAt(j)){
							flag=true;
							break;
						}
					}
				}
				index++;
			}
			if(flag){
				System.out.print((s[0].charAt(i))+" ");
			}
			index=1;
			flag=true;
		}
	}
}