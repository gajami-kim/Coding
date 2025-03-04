class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        int length = my_string.length();
        
        for(int i=length-n; i<=length-1; i++) {
            answer.append(my_string.charAt(i));
        }
        
        return answer.toString();
    }
}