// Q7. Find Maximum Element
// 👉 Return maximum value in array
// Input: [3,9,1,7]
// Output: 9

import java.util.*;
class Max_element{
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