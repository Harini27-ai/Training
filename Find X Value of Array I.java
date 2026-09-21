import java.util.*;
class Solution {
    public long[] resultArray(int[] nums, int k) {
        long[] result=new long[k];
        long[] dp=new long[k];
        for(int num:nums){
            long[] newdp=new long[k];
            int v=num%k;
            newdp[v]++;
            for(int r=0;r<k;r++){
                int newremainder=(r*v)%k;
                newdp[newremainder]+=dp[r];
            }
            for(int r=0;r<k;r++){
                result[r]+=newdp[r];
            }
            dp=newdp;
        }
        return result;
    }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] nums=new int[n];
    for(int i=0;i<n;i++){
      nums[i]=sc.nextInt();    
    }
    int k=sc.nextInt();
    Solution sol=new Solution();
    long[] result=sol.resultArray(nums,k);
    System.out.println(Arrays.toString(result));
  }
}
