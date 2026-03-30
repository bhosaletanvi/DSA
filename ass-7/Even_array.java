import java.util.*;
public class Even_array {
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
         if(arr[index]%2==0){
         return true;
      }
        return false;
      }
     boolean right=f(arr, index+1);
     if(arr[index]%2==0 && right==true){
        return true;
     }
     return false;
    }
}

