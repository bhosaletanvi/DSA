import java.util.*;
 class target{
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int [] arr = new int [size];
        System.out.print("Enter Elemets : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
         System.out.print("Enter target : ");
        int target = sc.nextInt();
        boolean ans=f(arr,0,target);
        System.out.println(ans);
    }   
    static boolean   f(int [] arr, int index,int target){
      if(index==arr.length-1){
        if(arr[index]==target){
            return true;
        }
        return false;
      }
      if(arr[index]==target){
            return true;
        }
        return f(arr, index+1, target);
    }
}

