// Q16. Find Index of Smallest Element
// 👉 Return index of minimum element
// Input: [5,2,8,1,3]
// Output: 3
import java.util.*;
class index_of_samllest_e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

       int [] arr = new int [size];
        System.out.print("Enter Elemets : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int ans = f(arr, 0);
        System.out.println("Index : " + ans);
    }

    static int f(int[] arr, int index) {
        if (arr.length - 1 == index) {
            return index;
        }
        int right = f(arr, index + 1);
        if (arr[index] < arr[right]) {
            return index;
        }

        return right;
    }
}