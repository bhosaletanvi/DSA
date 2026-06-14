import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size= sc.nextInt();
		ArrayList <Integer> al = new ArrayList<>();
		System.out.println("Enter number : ");
		for(int i=1;i<=size;i++){
			al.add(sc.nextInt());
		}	
	
		System.out.println("Enter Max Operation : ");
		int maxOp= sc.nextInt();
		
		while(maxOp!=0){
			int max=0;
			for(int i=0;i<al.size();i++){
				max=Math.max(max,al.get(i));
			}

			if(max%2==0){
				al.add(max/2);
				al.add(max/2);
				al.remove(Integer.valueOf(max));
				maxOp--;
			}else{
				al.add((max/2)-1);
				al.add((max/2)+2);
				al.remove(Integer.valueOf(max));
				maxOp--;

			}
			
		}
		System.out.print(al.get(0));
	}
}