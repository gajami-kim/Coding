import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        
        //num_list의 n부터 끝까지 answer의 앞부분으로 복사
        System.arraycopy(num_list, n, answer, 0, num_list.length - n);
        //num_list의 앞부분(0 ~ n-1) answer의 둣부분으로 복사
        System.arraycopy(num_list, 0, answer, num_list.length - n, n);
        
        return answer;
    }
}