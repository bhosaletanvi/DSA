import java.util.*;
class Target_contain{
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter array Size :");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.print("Enter array elements : ");
    for (int i = 0; i <arr.length; i++) {
        arr[i]=sc.nextInt();
    } 
    System.out.print("Enter Target : ");
    int target=sc.nextInt();  
    boolean flag=false;
    for (int i = 0; i < arr.length; i++) {
        if(arr[i]==target){
            flag=true;
            break;
        }    
    }
    System.out.print(flag);
    }
    
}