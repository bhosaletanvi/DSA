// Q11. Find Second Maximum
// 👉 Return second largest element
// Input: [10,5,8,20,15]
// Output: 15
//incorrect

// import java.util.*;
// public class Second_max {
//     public static void main(String[] args) {
//          Scanner sc =new Scanner(System.in);
//         System.out.print("Enter Array Size : ");
//         int size = sc.nextInt();
//         int [] arr = new int [size];
//         System.out.print("Enter Elemets : ");
//         for (int i = 0; i < arr.length; i++) {
//             arr[i]=sc.nextInt();
//         }
//         int max=f(arr,0);
//         System.out.println(max);
//     }
//     static  int max=0;
//     static int f(int[] arr,int index){
//         if(index==arr.length-1){
//             max=arr[index];
//             return arr[index];
//         }
//         int right=f(arr, index+1);
//         if(arr[index]>right){
//             max=arr[index];
//             return arr[index];
//         }
//         return right;
//     }
       
// }


