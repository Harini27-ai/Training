import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                int top=st.pop();
                if((ch==')' && top!='(') || (ch==']' && top!='[') || (ch=='}' && top!='{')){
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        }
        else{
            return false;
        }
        
    }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    Solution sol=new Solution();
    boolean result=sol.isValid(s);
    System.out.println(result);
  }
}
