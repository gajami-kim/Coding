class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = new StringBuilder(my_string.substring(s,e+1)).reverse().toString();
        
        return my_string.substring(0,s)+answer.toString()+my_string.substring(e+1);
    }
}