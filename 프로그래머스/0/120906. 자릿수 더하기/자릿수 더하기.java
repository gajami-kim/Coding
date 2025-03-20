class Solution {
    public int solution(int n) {
        int answer = 0;
        for(char ch : String.valueOf(n).toCharArray()) {
            answer += ch-'0';
        }
        return answer;
    }
}