import java.util.stream.IntStream;

class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] num = IntStream.iterate(a, i -> i + d)
            .limit(included.length)
                .toArray();
        
        for(int i=0; i<num.length; i++) {
            if(included[i]) {
                answer += num[i];
            }
        }
        return answer;
    }
}