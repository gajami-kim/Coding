import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String sen = br.readLine();
        char ch[] = sen.toUpperCase().toCharArray();
        int count = 0;
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        String result = "";

        for(char a : ch) {
            if(map.containsKey(a)) {
                count = map.get(a)+1;
            } else {
                count = 1;
            }
            map.put(a, count);
        }

        for(char a : map.keySet()) {
            if(map.get(a)>max) {
                max = map.get(a);
                result = String.valueOf(a);
            } else if(map.get(a) == max) {
                result = "?";
            }
        }
 
        System.out.println(result);
    }
}