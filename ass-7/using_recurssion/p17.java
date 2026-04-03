
import java.util.Scanner;

class divisible_by_k {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();

       int [] arr = new int [size];
        System.out.print("Enter Elemets : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter value of K: ");
        int k = sc.nextInt();
        int ans=f(arr,k,0);
        System.out.println(ans);
    }
    // static int count=0;
    static int f(int[] arr,int k ,int index){
        if(index>=arr.length){
            return 0;
        }
        int right=f(arr, k, index+1);
        if(arr[index]%k==0){
            return ++right;
        }
        return right;
    }
}
