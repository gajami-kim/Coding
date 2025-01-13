import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        Set<Integer> A = new HashSet<>();
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());
            A.add(num);
        }
    
        st = new StringTokenizer(br.readLine());
        Set<Integer> B = new HashSet<>();
        for(int i=0; i<m; i++) {
            int num = Integer.parseInt(st.nextToken());
            B.add(num);
        }

        int count = 0;
        for(int c : A) {
            if(!B.contains(c)) count++;
        }

        for(int c : B) {
            if(!A.contains(c)) count++;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        
    }


}
