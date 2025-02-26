import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] emergency) {
        List<Integer> sorted = Arrays.stream(emergency)
                                .boxed()
                                .sorted(Comparator.reverseOrder())
                                .collect(Collectors.toList());
        
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<sorted.size(); i++) {
            map.put(sorted.get(i),i+1);
        }
        
        return Arrays.stream(emergency)
                     .map(e -> map.get(e))
                     .toArray();
    }
}