class Solution {
    public String solution(int age) {
        StringBuilder answer = new StringBuilder();
        char[] alpha = new char[26];
        
        for(int i=0; i<26; i++) {
            alpha[i] = (char) ('a'+i);
        }
        
        String ageSt = Integer.toString(age);
        
        for(int i=0; i<ageSt.length(); i++) {
            answer.append(alpha[ageSt.charAt(i)-'0']);
        }
        
        return answer.toString();
    }
}