/*
 * First NUmber is range    n=10
 * Second number is divisible m=3
 * 
 * 1<= x<=10 => non divisible numbers 1,2,4,5,7,8,10   ndsum=37
 * 1<= x <=10 => Divisible NUmbers 3,6,9   dsum=18
 * 
 * 
 * The Answer is non divisble sum - divible sum.
 *  
 * 
 */

 package LeetCode.Math;

import java.util.Scanner;

class LC_2894 {
 public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int m= sc.nextInt();
    System.out.println(LC_2894.Method(n,m));
 }
 static int Method(int n, int m){
    int val1=0,val2=0;
        for(int i=1;i<=n;i++){
            if(i%m==0)
                val1+=i;
            else
                val2+=i;
        }
        return val2-val1;
 }
    
 }