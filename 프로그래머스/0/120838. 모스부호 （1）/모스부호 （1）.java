class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] alpa = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        
        StringBuilder answer = new StringBuilder();
        String[] part = letter.split(" ");
        
        for(int i=0; i<part.length; i++) {
            for(int j=0; j<morse.length; j++) {
                if(part[i].equals(morse[j])) {
                    answer.append(alpa[j]); 
                    break;
                }
            }
        }
        return answer.toString();
    }
}