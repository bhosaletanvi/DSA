// Q4. Check if Array is Sorted
// 👉 Return true if sorted in ascending order
// Input: [1,2,3,4]
// Output: true
import java.util.*;
class sorted_array{
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
    for (int i = 1; i < arr.length; i++) {
        if(arr[i-1]>arr[i]){
            flag=false;
            break;
        }
        
        
    }
    System.out.print(flag);
    }
    
    
}
