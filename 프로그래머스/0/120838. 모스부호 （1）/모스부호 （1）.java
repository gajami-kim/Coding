import java.util.*;
class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] alpa = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        
        Map<String, String> morseMap = new HashMap<>();
        for(int i=0; i<morse.length; i++) {
            morseMap.put(morse[i], alpa[i]);
        }
        
        for(String p : letter.split(" ")) {
            answer+=morseMap.get(p);
        }
        
        return answer;
    }
}