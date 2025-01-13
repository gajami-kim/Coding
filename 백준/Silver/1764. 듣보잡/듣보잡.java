import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> ears = new HashSet<>();
        for(int i=0; i<n; i++){
            ears.add(br.readLine());
        }

        //자동으로 오름차순 정렬되는 TreeSet 사용
        Set<String> res = new TreeSet<>();
        for(int i=0; i<m; i++) {
            String name = br.readLine();
            if(ears.contains(name)) {
                res.add(name);
            }
        }

        bw.write(res.size()+"\n");
        for(String name : res) {
            bw.write(name+"\n");
        }

        bw.flush();
        bw.close();

    }
}
