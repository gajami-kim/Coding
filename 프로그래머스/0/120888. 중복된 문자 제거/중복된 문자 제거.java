import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string) {
        String[] answer = my_string.split("");
        Set<String> set = new LinkedHashSet<String>(Arrays.asList(answer));
        
        return set.stream().collect(Collectors.joining());
    }
}