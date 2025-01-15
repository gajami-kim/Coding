import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        int t = Integer.parseInt(br.readLine());

        int MAX = 1000000;
        boolean[] isPrime = sieve(MAX);

        for(int i=0; i<t; i++) {
            int n = Integer.parseInt(br.readLine());
            bw.write(gold(n, isPrime)+"\n");
        }

        bw.flush();
        bw.close();
    }

    //에라토스테네스의 체를 사용하여 소수 배열 생성
    private static boolean[] sieve(int max) {   
        boolean[] isPrime = new boolean[max+1];
        Arrays.fill(isPrime, true); //모든 수를 소수로 초기화
        isPrime[0] = isPrime[1] = false;

        for(int i=2; i*i<=max; i++) {
            if(isPrime[i]) { //i가 소수라면
                for(int j = i*i; j<=max; j+=i) {
                    isPrime[j] = false; //i의 배수는 소수가 아님
                }
            }
        }

        return isPrime;
    }

    private static int gold(int num, boolean[] isPrime) {
        int count = 0;

        for(int i=2; i<=num/2; i++) {
            if(isPrime[i] && isPrime[num-i]) { //i와 num-i가 모두 소수인 경우우
                count++; 
            }
        }

        return count++;
    }
    
}
