import java.util.*;
public class Occurance {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int [] arr = new int [size];
        System.out.print("Enter Elemets : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter Target  : ");
        int target = sc.nextInt();
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            max=Math.max(max, arr[i]);
        }
        int[] freq = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        System.out.println("Target Occurance for "+freq[target]+" Times .");
    }   
    
}
