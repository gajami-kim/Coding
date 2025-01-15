import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t = Integer.parseInt(st.nextToken());
        

        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int lcm = lcm(a,b);
            bw.write(String.valueOf(lcm)+"\n");
        }

        bw.flush();
        bw.close();

    }

    private static int lcm(int a, int b) {
        int max = 0;
        for(int i=1; i<=a && i<=b; i++) {
            if(a%i==0 && b%i==0) max = i;
        }

        int min = (a*b)/max;
        return min;
    }
}
