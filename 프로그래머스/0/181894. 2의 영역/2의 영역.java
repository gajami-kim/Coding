import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int min = -1;
        int max = -1;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i]==2) {
                if(min == -1) {
                    min = i;
                } else {
                    max = i;
                }
            }
        }

        if(min > -1) {
            return Arrays.copyOfRange(arr, min, Math.max(min, max) +1);
        }
        
        return new int[]{-1};
    }
}