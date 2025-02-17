class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2]; 
        
        int lcm = (denom1 * denom2) / gcd(denom1, denom2);
        
        int numer = (numer1 * (lcm / denom1)) + (numer2 * (lcm / denom2));
        
        int gcd = gcd(numer, lcm); 
        answer[0] = numer / gcd;    
        answer[1] = lcm / gcd;       
        
        return answer;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}