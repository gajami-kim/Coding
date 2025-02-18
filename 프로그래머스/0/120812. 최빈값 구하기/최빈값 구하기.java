import java.util.*;
import java.io.*;
class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : array) {
            map.put(num, map.getOrDefault(num,0)+1);
        }
        
        int max = Collections.max(map.values());
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue()==max) {
                list.add(entry.getKey());
            }
        }
        Collections.sort(list);
        
        return list.size() > 1 ? -1 : list.get(0);
    }
}