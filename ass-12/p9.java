import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size : ");
		int size= sc.nextInt();
		sc.nextLine();

		String [] str = new String[size];
		System.out.println("Enter String  : ");
		for(int i=0;i<str.length;i++){
			str[i]=sc.nextLine();
		}
	
		HashMap <Character , Integer> hm = new HashMap<>();
		System.out.println("Enter word : ");
		String word = sc.nextLine();
		for(int i=0;i<word.length();i++){
			hm.put(word.charAt(i),hm.getOrDefault(word.charAt(i),0)+1);
		}

		for(int i=0;i<str.length;i++){
			String temp = str[i];
			int count =0;
			for(int j=0;j<temp.length();j++){
				count+=hm.getOrDefault(temp.charAt(j),0);
			}
			if(count==0){
				System.out.print(temp);
				break;
			}
		}	
	}
}