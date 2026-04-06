// Q2. Frequency Greater Than K
// Print all elements whose frequency is greater than K
// Example:
// arr = [1,1,2,2,2,3], K = 2
// → Output: 2
import java.util.HashMap;
import java.util.Scanner;

 class demo {
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
        HashMap <Integer,Integer> hm =new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        for(Integer key : hm.keySet()){
            if(hm.get(key)>k){
                System.out.println(key);
            }
        }
    }
}
