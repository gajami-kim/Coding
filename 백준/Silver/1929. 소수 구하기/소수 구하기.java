import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        for(int i=m; i<=n; i++) {
            if(isPrime(i)) bw.write(i+"\n");
        }

        bw.flush();
        bw.close();
    }

    //소수 구하기
    private static boolean isPrime(int num) {
        if(num < 2) return false;
        for(long i=2; i*i<=num; i++) {
            if(num % i == 0) return false;
        }
        return true; //소수일경우
    }

   
}
