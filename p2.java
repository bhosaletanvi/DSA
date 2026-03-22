// N to 1 with using count
import java.util.*;
class p2{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=sc.nextInt();
        fun(n,n);
    }
    static void fun(int n,int count){
        if(count<1){
            return;
        }
        System.out.println(count);
        count--;
        fun(n, count);
    }
}