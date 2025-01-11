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
                    //알파벳순 정렬
                    return s1.compareTo(s2);
                }
                //길이순정렬
                return s1.length() - s2.length();
            }
        });

        //set을 이용해 중복된 단어를 자동제거, 정렬된 상태로 추가
        for(String word : arr) {
            unique.add(word);
        }

        for(String word : unique) {
            System.out.println(word);
        }

        br.close();
    
    }
    
}