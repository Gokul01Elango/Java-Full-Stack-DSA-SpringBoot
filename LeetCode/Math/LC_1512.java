/*
 * 
 * if two values are equal then we can consider that as a good pair  like 
 * 
 * nums = [1,2,3,1,1,3]
 * Output: 4
    Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
 * 
 */

package LeetCode.Math;

public class LC_1512 {
    public static void main(String args[]){
        int arr[]={1,2,3,1,1,3};
        int count=0;
        for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j])
                        count++;
                }
        }
        System.out.println(count);
    }
}
