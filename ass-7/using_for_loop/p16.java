// Q16. Find Index of Smallest Element
// 👉 Return index of minimum element
// Input: [5,2,8,1,3]
// Output: 3
import java.util.*;
class index_of_min{
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter array Size :");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.print("Enter array elements : ");
    for (int i = 0; i <arr.length; i++) {
        arr[i]=sc.nextInt();
    } 
    
    int ans=0;
    for (int i = 0; i < arr.length; i++) {
         if(arr[i]<arr[ans]){
            ans=i;
         } 
    }
    System.out.println("index of min element : "+ans);
    }
    
}