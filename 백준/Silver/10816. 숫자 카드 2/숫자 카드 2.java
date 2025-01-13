import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> nMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(st.nextToken());
            Integer count = nMap.get(num);
            if (count == null) {
                nMap.put(num, 1); // 처음 등장하는 숫자
            } else {
                nMap.put(num, count + 1); // 기존 숫자의 등장 횟수 증가
            }
        }
        
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<m; i++) {
            int num = Integer.parseInt(st.nextToken());
            Integer count = nMap.get(num);
            if(count==null) {
                bw.write("0"+" ");
            } else {
                bw.write(count+" ");
            }
        }      
        
        bw.flush();
        bw.close();

    }
}
