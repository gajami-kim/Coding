import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];

        for(int i=0; i<n; i++) {
            arr[i] = br.readLine();
        }

        Set<String> unique = new TreeSet<>(new Comparator<String>() {
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                }
                return s1.length() - s2.length();
            }
        });

        for(String word : arr) {
            unique.add(word);
        }

        for(String word : unique) {
            System.out.println(word);
        }

        br.close();
    
    }
    
}