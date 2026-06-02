import java.util.Scanner;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of players : ");
		int size1 = sc.nextInt();

		System.out.print("Enter Size of Trainer : ");
		int size2 = sc.nextInt();
		
		int [] player = new int[size1];
		int [] trainer = new int[size2];

		System.out.print("Enter players : ");
		for(int i=0;i<player.length;i++){
			player[i]=sc.nextInt();
		}

		System.out.print("Enter Trainers : ");
		for(int i=0;i<trainer.length;i++){
			trainer[i]=sc.nextInt();
		}

		int count=0;
		for(int i=0;i<player.length-1;i++){
			for(int j=0;j<trainer.length;j++){
				if(player[i]<trainer[j]){
					count++;
					trainer[j]=0;
					break;
				}
			}
		}
		System.out.print(count);
	}
}