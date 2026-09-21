import java.util.*;
class Solution {
    public int maxProduct(int[] nums) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int num:nums){
            if(num>max1){
                max2=max1;
                max1=num;
            }
            else if(num>max2){
                max2=num;
            }
        }
        return (max1-1)*(max2-1);

    }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] nums=new int[n];
    for(int i=0;i<n;i++){
      nums[i]=sc.nextInt();   
    }
    int result=maxProduct(nums);
    System.out.print(result);
  }
}
