class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = new StringBuilder(my_string.substring(s,e+1)).reverse().toString();
        
        if(my_string.length()>e) {
            return my_string.substring(0,s)+answer.toString()+my_string.substring(e+1, my_string.length());
        }
        return my_string.substring(0,s)+answer.toString();
    }
}