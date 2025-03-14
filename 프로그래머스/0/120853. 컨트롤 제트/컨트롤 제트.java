import java.util.*;

class Solution {
    public int solution(String s) {
        String[] str = s.split(" ");
        Stack<Integer> stack = new Stack<>();
        
        for(String st : str) {
            if(st.equals("Z")) {
                if(!stack.isEmpty()) stack.pop();
            } else {
                stack.push(Integer.parseInt(st));
            }
        }
        
        return stack.stream().mapToInt(Integer::intValue).sum();
    }
}