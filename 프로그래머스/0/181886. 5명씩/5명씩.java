class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(names.length+4)/5];
        int index = 0;
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = names[index];
            index+=5;
        }
        
        
        return answer;
    }
}