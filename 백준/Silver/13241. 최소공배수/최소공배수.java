import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());

        bw.write(String.valueOf(lcm(a, b)));
        bw.flush();
        bw.close();
    }

    //최대 공약수
    private static long gcd(long a, long b) {
        if(a<b) {
            long temp = a;
            a = b;
            b = temp;
        }
        while(b!=0) {
            long r = a%b;
            a=b;
            b=r;
        }
        return a;
    }

    //최소 공배수
    private static long lcm(long a, long b) {
        return a*b / gcd(a, b);
    }
}
