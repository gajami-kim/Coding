import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
       Map<String, Integer> map = new HashMap<>();
        
        for(String part : participant) {
            map.put(part, map.getOrDefault(part,0)+1);
        }
        
        for(String comp : completion) {
            map.put(comp, map.get(comp)-1);
        }
        
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()==1) {
                return entry.getKey();
            }
        }
        
        return "";
    }
}