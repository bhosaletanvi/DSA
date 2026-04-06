// Q2. Frequency exactly K
// Print all elements whose frequency is exactly K
// Example:
// arr = [1,1,2,2,2,3], K = 2
// → Output: 2
import java.util.Scanner;

 class demo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter array Size :");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter array elements : ");
        for (int i = 0; i <arr.length; i++) {
        arr[i]=sc.nextInt();
        } 
        System.out.print("Enter Value of K:");
        int k=sc.nextInt(); 
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max, arr[i]);
        }
        int [] freq=new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]==k){
                System.out.println(i);
            }
        }

    }
}
