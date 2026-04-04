// Q13. Count Elements Greater Than X
// 👉 Return count of elements greater than given value
// Input: arr = [1,5,3,7,2], x = 3
// Output: 2
import java.util.*;
 class Greater {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int [] arr = new int [size];
        System.out.print("Enter Elemets : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter X value : ");
        int x = sc.nextInt();
        int ans = f(arr, 0, x);
        System.out.println(ans);
    }

    static int count = 0;

    static int f(int[] arr, int index, int target) {

        if (index == arr.length - 1) {
            if (arr[index] > target) {
                return 1;
            }
            return 0;
        }

        int right = f(arr, index + 1, target);

        if (arr[index] > target) {
            ++count;
        }

        return count;
    }
}