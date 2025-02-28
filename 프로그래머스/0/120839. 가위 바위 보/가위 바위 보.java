class Solution {
    public String solution(String rsp) {
        String answer = "";
        char[] ch = rsp.toCharArray();
        
        for(int i=0; i<ch.length; i++) {
            answer += ch[i]==('2') ? 0 : (ch[i]==('0') ? 5 : 2); 
        }
        
        return answer;
    }
}