import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        List<String> answer = new ArrayList<>();
        
        for(String ans : quiz) {
            String[] parts = ans.split(" ");
            int a = Integer.parseInt(parts[0]);
            String op = parts[1];
            int b = Integer.parseInt(parts[2]);
            int result = Integer.parseInt(parts[4]);
            
            if(op.equals("+")) {
                if(a+b == result) answer.add("O");
                else answer.add("X");
            } else if(op.equals("-")) {
                if(a-b == result) answer.add("O");
                else answer.add("X");
            }
            
        }
        
        return answer.toArray(new String[0]);
    }
}