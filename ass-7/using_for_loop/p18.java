// 18. Check if All Elements are Unique
// 👉 Return true if no duplicates exist
// Input: [1,2,3,4]
// Output: true
import java.util.*;
class Unique_array{
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
        int count=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[i]==arr[j]){
                count++;
            }
        }
        if(count>1){
            flag=false;
            break;
        }
        
    }    
    System.out.println(flag);
}
    
}