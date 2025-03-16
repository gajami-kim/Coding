import java.util.*;
class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new TreeMap<>();
        StringBuilder answer = new StringBuilder();
        
        for(char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() == 1) answer.append(entry.getKey()); 
        }
        
        return answer.toString();
    }
}