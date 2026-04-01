// Q6. Check if Any Element is Negative
// 👉 Return true if at least one negative exists
// Input: [1,2,-3,4]
// Output: true

import java.util.*;
class Negative_array{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    System.out.print("Enter array Size :");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.print("Enter array elements : ");
    for (int i = 0; i <arr.length; i++) {
        arr[i]=sc.nextInt();
    } 
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                flag=true;
                break;
            }
            
        }
        System.out.println(flag);
    }
    
}
