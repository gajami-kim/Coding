import java.util.*;
class Solution {
    public long solution(String numbers) {
        Map<String, String> numberMap = new HashMap<>();
        numberMap.put("one", "1");
        numberMap.put("two", "2");
        numberMap.put("three", "3");
        numberMap.put("four", "4");
        numberMap.put("five", "5");
        numberMap.put("six", "6");
        numberMap.put("seven", "7");
        numberMap.put("eight", "8");
        numberMap.put("nine", "9");
        numberMap.put("zero", "0");

        StringBuilder str = new StringBuilder();
        int i = 0;
        
        while(i < numbers.length()) {
            for(int j=3; j<=5; j++) {
                String sub = numbers.substring(i, Math.min(i + j, numbers.length()));
                if(numberMap.containsKey(sub)) {
                    str.append(numberMap.get(sub));
                    i += j;
                    break;
                }
            }
        }

        return Long.parseLong(str.toString());
    }
}