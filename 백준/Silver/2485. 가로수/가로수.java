import java.io.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int[] tree = new int[n];

        for(int i=0; i<n; i++) {
            tree[i] = Integer.parseInt(br.readLine());
        }

        //가로수 간의 간격
        int[] gap = new int[n-1];
        for(int i=0; i<n-1; i++) {
            gap[i] = tree[i+1] - tree[i];
        }

        //모든 간격의 최대 공약수
        int avgGcd = gap[0];
        for(int i=1; i<n-1; i++) {
            avgGcd = getGcd(avgGcd, gap[i]);
        }

        int count = 0;
        for(int value : gap) {
            count += (value / avgGcd) - 1;
        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }

    private static int getGcd(int a, int b) {
        if(a % b ==0) {
            return b;
        }
        return getGcd(b, a%b);
    }
}
