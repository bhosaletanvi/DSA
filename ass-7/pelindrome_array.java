import java.util.*;
public class pelindrome_array {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        System.out.print("Enter Array Size : ");
        int size = sc.nextInt();
        int [] arr = new int [size];
        System.out.print("Enter Elemets : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int mid=arr.length/2;
        boolean flag=false;
        int i=0;
        while(i<=mid-1){
            for (int j = arr.length-1; j >=mid+1; j--) {
                if(arr[i]==arr[j]){
                    flag=true;
                }
                i++;
            }
        }
        System.out.println(flag);
       
}
}

