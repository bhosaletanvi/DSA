// Q8. Find Minimum Element
// 👉 Return minimum value
// Input: [3,9,1,7]
// Output: 1
import java.util.*;
class Min_element{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    System.out.print("Enter array Size :");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.print("Enter array elements : ");
    for (int i = 0; i <arr.length; i++) {
        arr[i]=sc.nextInt();
    } 
     int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<max){
                max=arr[i];
            }
        }
        System.out.println("Min element : "+max);
    }
    
}