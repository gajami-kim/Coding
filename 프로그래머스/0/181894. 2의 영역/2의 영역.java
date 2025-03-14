import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==2) {
                list.add(i);
                count++;
            }
        }
        
        if(count>=2) {
            int start = Collections.min(list);
            int end = Collections.max(list);
            return Arrays.copyOfRange(arr, start, end+1);
        } else if(count==1) {
            int two = list.get(0);
            return new int[]{(arr[two])};
        } else {
            return new int[]{-1};
        }
        
    }
}