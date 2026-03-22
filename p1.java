// 1 to N with using count

import java.util.*;
class p1{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n=sc.nextInt();
        fun(n,1);
    }
    static void fun(int n,int count){
        if(count>n){
            return;
        }
        System.out.println(count);
        count++;
        fun(n, count);
    }
}