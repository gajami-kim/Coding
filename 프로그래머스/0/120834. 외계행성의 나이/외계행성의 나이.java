class Solution {
    public String solution(int age) {
        String answer = "";
        
        String st = Integer.toString(age);
        
        for(char ch : st.toCharArray()) {
            answer += (char)('a' + (ch - '0'));
        }
        
        return answer;
    }
}