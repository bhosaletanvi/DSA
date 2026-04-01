import java.util.*;
 class negative_sum {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int [] arr = new int [size];
        System.out.print("Enter Elemets : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int ans = F(arr, 0);
        System.out.println(ans);   
    }
    static int F(int[] arr, int index) {
        if (index >= arr.length) {
            return 0;
        }
        int right = F(arr, index + 1);
          if (arr[index] < 0) {
            return arr[index] + right;
        }
        return right;
    }
}