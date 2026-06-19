import java.util.Scanner;
class demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.print("\nEnter Elements : ");
		int max=0;
		boolean flag=true;
		int [] arr1= new int [arr.length/2];
		int [] arr2= new int [arr.length/2];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			max=Math.max(arr[i],max);

		}	
		int one=0,two=0,index=one;
		int [] freq= new int [max+1];
		for(int i=0;i<arr.length;i++){
			freq[arr[i]]++;
		}
		for(int i=0;i<freq.length;i++){
			if(arr.length%2!=0){
				flag=false;
				break;
			}
			if(freq[i]>2){
				flag=false;
				break;
			}else if(freq[i]==2){
				arr1[one] = i;
				arr2[two] = i;
				one++;
				two++;
				index++;
			}else if(freq[i]==1){
				if(index==one){
					arr1[index]=i;
					one++;
					index=two;
					if(index==(arr.length/2)){
						index--;
					}

				}else{
					arr2[index]=i;
					two++;
					index=one;
					if(index==(arr.length/2)){
						index--;
					}

				}
				if(index==(arr.length/2)){
					break;
				}

			}
		}

		System.out.print(flag);		
	}
}