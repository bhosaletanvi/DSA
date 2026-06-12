import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Intervals: ");
		int n= sc.nextInt();
		ArrayList <Integer> al = new ArrayList<>();
		int [][] arr = new int[n][2];
		System.out.println("Enter Numbers : ");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				arr[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<arr.length;i+=2){
			int start1=arr[i][0];
			int end1=arr[i][1];
			int start2=arr[i+1][0];
			int end2=arr[i+1][1];
			
			if(end1>=start2){
				al.add(start1);
				al.add(end2);
			}else{
				al.add(start1);
				al.add(end1);
				al.add(start2);
				al.add(end2);

			}

		}
		for(int i=0;i<al.size();i++){
			System.out.print(al.get(i)+" ");
		}
	}
}