// 13. Count Elements Greater Than X
// 👉 Return count of elements greater than given value
// Input: arr = [1,5,3,7,2], x = 3
// Output: 2
import java.util.*;
class Grated_than_X{
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter array Size :");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.print("Enter array elements : ");
    for (int i = 0; i <arr.length; i++) {
        arr[i]=sc.nextInt();
    } 
    System.out.print("Enter Value of K:");
    int k=sc.nextInt();  
    int count=0;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]>k){
            count++;
        }    
    }
    System.out.print("array have "+count+" elements greater than "+k);
    }
    
}