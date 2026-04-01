// Q9. Sum of Elements at Odd Index
// 👉 Return sum of elements at index 1,3,5...
// Input: [10,20,30,40,50]
// Output: 20 + 40 = 60

import java.util.*;
class odd_index_sum{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    System.out.print("Enter array Size :");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.print("Enter array elements : ");
    for (int i = 0; i <arr.length; i++) {
        arr[i]=sc.nextInt();
    } 
       int sum=0;
       for (int i = 0; i < arr.length; i++) {
           if(i%2!=0){
            sum=sum+arr[i];
           }
           
           
       }
       System.out.print("Sum : "+sum);
    }
    
}