package LeetCode.Math;

public class LC_231 {

    public static void main(String[] args) {
       System.out.println(LC_231.isPowerOfTwo(28)); 
    }

    
    public static boolean isPowerOfTwo(int n) {
           
                    while(n>1){
                        if(n%2==0){
                            n=n/2;
                        }
                        else
                            return false;
                    }
                    if(n==1)
                        return true;
            return false;
          
    }
}
