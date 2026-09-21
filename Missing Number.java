import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        int xor=0;
        xor=xor^nums.length;
        for(int i=0;i<nums.length;i++){
            xor=xor^i^nums[i];
        }
        return xor;
    }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] nums=new int[n];
    for(int i=0;i<n;i++){
      nums[i]=sc.nextInt();
    }
    Solution sol=new Solution();
    int result=sol.missingNumber(nums);
    System.out.println(result);
  }
}
