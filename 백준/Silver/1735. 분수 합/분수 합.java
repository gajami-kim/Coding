import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());        
        int b = Integer.parseInt(st.nextToken());        
        st = new StringTokenizer(br.readLine()); //줄바꿈
        int c = Integer.parseInt(st.nextToken());        
        int d = Integer.parseInt(st.nextToken());        

        int num = (a*d) + (b*c);
        int den = b*d;

        int gcd = getGcd(num, den);

        num /= gcd;
        den /= gcd;

        bw.write(String.valueOf(num) + " "+ String.valueOf(den));
        bw.flush();
        bw.close();
    }

    private static int getGcd(int a, int b) { //최대공약수
        if(a % b ==0) {
            return b;
        }
        return getGcd(b, a%b);
    }
}
