// 7. Find Maximum Element
// 👉 Return maximum value in array
// Input: [3,9,1,7]
// Output: 9
import java.util.*;
 class Max_element{
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int [] arr = new int [size];
        System.out.print("Enter Elemets : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int ans=f(arr,0);
        System.out.println(ans);
    }   
    static int  f(int [] arr, int index){
    
      if(index==arr.length-1){
        return arr[index];
      }
      int right=f(arr,index+1);
      if(arr[index]>right){
        return arr[index];
      }
      return right;
      
      
    }
}

