import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        //문자와 숫자 도감을 따로 저장
        HashMap<String, Integer> nameMap = new HashMap<>();
        HashMap<Integer, String> numMap = new HashMap<>();

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            nameMap.put(str,i+1);
            numMap.put(i+1, str);
        }

        for(int i=1; i<=m; i++) {
            String q = br.readLine();
            int p;
            //try-catch를 이용해 숫자/문자를 구분분
            try {
                p = Integer.parseInt(q);
                bw.write(numMap.get(p)+"\n");
            } catch(Exception e) {
                bw.write(nameMap.get(q)+"\n");
            }
        }

        bw.flush();
        bw.close();

    }
}
