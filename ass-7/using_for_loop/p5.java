// Q5. Check if All Elements are Even
// 👉 Return true if all elements are even
// Input: [2,4,6]
// Output: true

import java.util.*;
class even_array{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    System.out.print("Enter array Size :");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.print("Enter array elements : ");
    for (int i = 0; i <arr.length; i++) {
        arr[i]=sc.nextInt();
    } 
        boolean flag=true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
                flag=false;
                break;
            }
            
        }
        System.out.println(flag);
    }
    
}
