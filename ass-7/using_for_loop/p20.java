// Q20. Check if Array is Strictly Decreasing
// 👉 Return true if strictly decreasing
// Input: [9,7,5,2]
// Output: true
import java.util.*;
 class Stricktly_decresing {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int [] arr = new int [size];
        System.out.print("Enter Elemets : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
            int max=0;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
        }

        int[] freq = new int[max + 1];
        for (int j = 0; j < arr.length; j++) {
            freq[arr[j]]++;
        }

        boolean flag = false;

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] <= 1) {
                flag = true;
            } else {
                flag = false;
                System.out.print(flag);
                break;
            }
        }
        boolean ans=false;
        if (flag) {
            for (int i = 1; i < arr.length; i++) {
                if(arr[i-1]>arr[i]){
                    ans=true;
                }
                else{
                    ans=false;
                    break;
                }
            }
            System.out.println(ans);
            
        } 
    }

   
}