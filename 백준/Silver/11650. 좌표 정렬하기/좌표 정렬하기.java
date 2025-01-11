import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Integer map[][] = new Integer[n][2];

        for(int i=0; i<n; i++) {
            String[] s = br.readLine().split(" ");
            map[i][0] = Integer.parseInt(s[0]);
            map[i][1] = Integer.parseInt(s[1]);
        }

        Arrays.sort(map, (a,b)-> {
            if(a[0].equals(b[0])) {
                return a[1] - b[1];
            } return a[0] - b[0];
        });

        for(int i=0; i<n; i++) {
            sb.append(map[i][0]);
            sb.append(" ");
            sb.append(map[i][1]);
            sb.append("\n");
        }

        System.out.println(sb.toString());
        br.close();
    
    }
    
}