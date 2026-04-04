import java.util.*;
class divisible_by_K{
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
        if(arr[i]%k==0){
            count++;
        }    
    }
    System.out.print("array have "+count+" elements divisible by "+k);
    }
    
}