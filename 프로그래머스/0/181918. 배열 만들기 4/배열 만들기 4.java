import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> stk = new ArrayList<>();
        int i=0;
        
        while(i<arr.length) {
            if(stk.isEmpty() || stk.get(stk.size()-1) < arr[i]) {
                stk.add(arr[i]);
            } else {
                stk.remove(stk.size()-1);
                continue; //원소 제거 후 i값 증가없이 다시 처리
            }
            i++;
        }
        
        
        return stk.stream().mapToInt(a -> a).toArray();
    }
}