import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size : ");
		int size= sc.nextInt();
		String [] str = new String[size];
		System.out.println("Enter String : ");
		for(int i=0;i<str.length;i++){
			str[i]=sc.nextLine();
		}
		sc.nextLine();
		for(int i=0;i<str.length;i++){
			System.out.println(str[i]);
		}

		boolean flag = true;
		for(int j=0;j<str.length;j++){
			String temp = str[j];
			System.out.println(temp);

			int index=0;
			flag = true;
			for(int i=temp.length()-1;i>=0;i--){
				if(temp.charAt(index)!=temp.charAt(i)){
					flag = false;
					break;
		
				}
				index++;
			}
			if(flag){
				System.out.print(temp);
				break;
			}
		}
	}
}