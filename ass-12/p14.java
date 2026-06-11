import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("enter City pair Count : ");
		int size = sc.nextInt();
		sc.nextLine();
		System.out.print("enter Cities : ");
		String [][] path = new String[size][2];
		for(int i=0;i<size;i++){
			for(int j=0;j<2;j++){
				path[i][j]=sc.nextLine();
			}
		}
		System.out.println("City Path..");
		
		for(int i=0;i<size;i++){
			System.out.println(path[i][0]+" --> "+path[i][1]);

		}

		boolean flag =false;
		for(int i=0;i<size;i++){
			String city = path[i][1];
			flag = false;
			for(int j=0;j<size;j++){
				if(city.equals(path[j][0])){
					flag=true;
					break;
				}
			}
			if(!flag){
				System.out.print(city+" ");
			}
		}		
	}
}