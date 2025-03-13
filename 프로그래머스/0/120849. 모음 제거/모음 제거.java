class Solution {
    public String solution(String my_string) {
        String[] alpa = {"a","e","i","o","u"};
        
        for(String st : alpa) {
            my_string = my_string.replaceAll(st,"");
        }
        
        return my_string;
    }
}