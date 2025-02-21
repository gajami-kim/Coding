import java.util.stream.IntStream;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = IntStream.rangeClosed(l,r)
            .filter(n ->String.valueOf(n).matches("[50]+"))
            .toArray();
        
        return answer.length > 0 ? answer : new int[]{-1};
    }
}