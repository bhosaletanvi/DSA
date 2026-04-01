// Q10. Check Palindrome Array
// 👉 Return true if array is palindrome
// Input: [1,2,3,2,1]
// Output: true

import java.util.*;
class pelindrome_array{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    System.out.print("Enter array Size :");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.print("Enter array elements : ");
    for (int i = 0; i <arr.length; i++) {
        arr[i]=sc.nextInt();
    } 
       int mid=arr.length/2;
       int i=0;
       boolean flag=false;
       while(i<=mid-1){
            for (int j = arr.length; j < mid+1; j++) {
            if(arr[j]!=arr[i]){
                flag=true;
            }
            i++;
         }
         System.out.println(flag);
       }
    
    }
    
}