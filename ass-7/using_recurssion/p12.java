// Q12. Check Strictly Increasing
// 👉 Return true if strictly increasing (no equal allowed)
// Input: [1,2,3,3]
// Output: false
import java.util.*;
 class Stricktly_incresing {
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
            }
        }

        if (flag) {
            boolean ans = F(arr, 0);
            System.out.println(ans);
        } else {
            System.out.println(flag);
        }
    }

   static boolean F(int[] arr, int index) {

        if (index == arr.length - 1) {
            return true;
        }

        boolean right = F(arr, index + 1);

        if (right) {
            if (arr[index] > arr[index + 1]) {
                return false;
            }
            return true;
        }

        return false;
    }
}