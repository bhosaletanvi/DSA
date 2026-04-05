
import java.util.HashMap;
import java.util.Scanner;

 class hashmap {
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
