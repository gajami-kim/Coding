class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        char[] arr = new char[my_string.length()];
        
        for(int i=0; i<arr.length; i++) {
            arr[i] = my_string.charAt(i);
        }
        
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<n; j++) {
                answer.append(arr[i]);
            }
        }
        
        return answer.toString();
    }
}