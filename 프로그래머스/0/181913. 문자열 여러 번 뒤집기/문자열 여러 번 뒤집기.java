class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        for(int[] query : queries) {
            int s = query[0];
            int e = query[1];
            
            String reverse = new StringBuilder(answer.substring(s, e+1)).reverse().toString();     
            answer.replace(s, e+1, reverse);
        }
        return answer.toString();
    }
}