package LeetCode.Math;

public class LC_2469 {

    public static void main(String args[]){
        
    }

     public double[] convertTemperature(double celsius) {
        double[] ans = new double[2];
        ans[0]=String.format("%.2f",celsius);
        ans[1]=String.format(celsius*1.80+32.00 );
        return ans;
    }
}