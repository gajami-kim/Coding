import java.io.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        while(true) {
            int n = Integer.parseInt(br.readLine());

            if(n==0)  break;

            int count = 0;
            for(int i=n+1; i<=2*n; i++) {
                if(isPrime(i)) count++;
            }
            
            if(count>0) {
                bw.write(String.valueOf(count)+"\n");
            }
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
