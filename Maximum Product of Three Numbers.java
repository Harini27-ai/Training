import java.util.*;
class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int option1=nums[n-1]*nums[n-2]*nums[n-3];
        int option2=nums[0]*nums[1]*nums[n-1];
        return Math.max(option1,option2);
    }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] nums=new int[n];
    for(int i=0;i<n;i++){
      nums[i]=sc.nextInt();
      
    }
    Solution sol=new Solution();
    int result=sol.maximumProduct(nums);
    System.out.println(result);
  }
}
