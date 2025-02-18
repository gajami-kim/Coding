class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        
        answer = (ineq.equals(">") && eq.equals("=") && n >= m) ||
         (ineq.equals(">") && eq.equals("!") && n > m) ||
         (ineq.equals("<") && eq.equals("=") && n <= m) ||
         (ineq.equals("<") && eq.equals("!") && n < m) ? 1 : 0;
        
        return answer;
    }
}