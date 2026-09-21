import java.util.*;
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int[] rotated=new int[n];
        for(int i=0;i<n;i++){
            rotated[(i+k)%n]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=rotated[i];      
        }
    }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] nums=new int[n];
    for(int i=0;i<n;i++){
      nums[i]=sc.nextint();
    }
    int k=sc.nextInt();
    Solution sol=new Solution();
    sol.rotate(nums,k);
    System.out.println(Arrays.toString(nums));
  }
}
