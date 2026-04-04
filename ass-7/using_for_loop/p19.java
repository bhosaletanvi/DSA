import java.util.*;
class Sum_of_digits{
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter array Size :");
    int size=sc.nextInt();
    int[] arr=new int[size];
    System.out.print("Enter array elements : ");
    for (int i = 0; i <arr.length; i++) {
        arr[i]=sc.nextInt();
    } 
    int sum=0;
    for (int i = 0; i < arr.length; i++) {
        while(arr[i]!=0){
            int digit=arr[i]%10;
            sum=sum+digit;
            arr[i]=arr[i]/10;
        }  
    }
    System.out.println(sum);
    }
    
}