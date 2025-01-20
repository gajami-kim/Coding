import java.io.*;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        int hi = 0;

        for(int i=0; i<N; i++) {
            set.add(br.readLine());
            if(set.contains("ENTER")) {
                hi+=set.size()-1;
                set.clear();
            }
        }
        hi+=set.size();
        System.out.println(hi);
    }
}