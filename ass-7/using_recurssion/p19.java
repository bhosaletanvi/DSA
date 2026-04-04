// 19. Find Sum of Digits of All Elements
// 👉 Each element is a number → sum all digits recursively
// Input: [12, 34, 5]
// Output: 1+2+3+4+5 = 15

import java.util.Scanner;

class Sum {
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
        System.out.println(ans);
    }

    static int f(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }

        int right = f(arr, index + 1);

        while (arr[index] != 0) {
            int digit = arr[index] % 10;
            right = right + digit;
            arr[index] = arr[index] / 10;
        }

        return right;
    }
}