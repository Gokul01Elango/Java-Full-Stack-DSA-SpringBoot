// Add digits until it became less than 10 or single value.


package LeetCode.Math;

public class LC_258 {

    public static void main(String args[]){
        int num=21893;
        while(num>9){
            int sum=0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            num=sum;
        }
        System.out.println(num);
    }
    
}