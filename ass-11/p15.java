import java.util.*;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of pairs : ");
		int size= sc.nextInt();
		int [][] booking = new int [size][3];

		System.out.println("Enter Booking pairs : ");
		for(int i=0;i<booking.length;i++){
			for(int j=0;j<booking[0].length;j++){
				booking[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter number of flight : ");
		int n= sc.nextInt();
		int [] flight = new int[n];
		for(int i=0;i<booking.length;i++){
			int start = booking[i][0]-1;
			int end = booking[i][1]-1;
			while(start<=end){
				flight[start]+=booking[i][2];
				start++;	
			}
						
		}
		for(int i =0;i<flight.length;i++){
			System.out.print(flight[i]+" ");
		}
	}
}