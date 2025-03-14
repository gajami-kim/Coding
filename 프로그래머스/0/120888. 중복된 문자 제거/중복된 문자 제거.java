import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        Set<String> set = new LinkedHashSet<>();
        
        for(char ch : my_string.toCharArray()) {
            set.add(Character.toString(ch));
        }
        
        return set.stream().collect(Collectors.joining());
    }
}