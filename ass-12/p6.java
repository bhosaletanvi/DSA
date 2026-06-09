import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size : ");
		int size= sc.nextInt();
		sc.nextLine();
		String [] str = new String[size];
		System.out.println("Enter String : ");
		for(int i=0;i<str.length;i++){
			str[i]=sc.nextLine();
		}

		String rev=" ";
		for(int j=0;j<str.length;j++){
			String temp = str[j];
			rev="";			
			for(int i=temp.length()-1;i>=0;i--){
				rev+=temp.charAt(i);
			}

			if(temp.equals(rev)){
				System.out.print(temp);
				break;
			}
		}
	}
}