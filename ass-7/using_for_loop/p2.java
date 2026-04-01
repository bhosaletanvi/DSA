// Q2. Find First Occurrence
// 👉 Return index of last occurrence of target
// Input: arr = [5,2,3,2,4], target = 2
// Output: 3
import java.util.*;
class L_Occurance{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    System.out.print("Enter array Size :");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.print("Enter array elements : ");
    for (int i = 0; i <arr.length; i++) {
        arr[i]=sc.nextInt();
    } 
     System.out.print("Enter number  :");
    int n=sc.nextInt();  
    for (int i = arr.length-1; i >=0; i--) {
        if(arr[i]==n){
            System.out.print("index : "+i);
            break;
        }
    }
    }
    
}
