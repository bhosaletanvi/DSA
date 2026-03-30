import java.util.*;
public class Sorted_array {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int [] arr = new int [size];
        System.out.print("Enter Elemets : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        boolean ans=f(arr,0);
        System.out.println(ans);
    }   
    static boolean  f(int [] arr, int index){
      if(index==arr.length-1){
        return true;
      }
      boolean right=f(arr,index+1);
      if(right){
        if(arr[index]<arr[index+1]){
            return right;
        }
        else{
             return false;
        }
       
      }
      return false;
    }
}

