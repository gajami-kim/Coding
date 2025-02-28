class Solution {
    public long solution(int balls, int share) {
        return combination(balls, share);
    }

    private long combination(int n, int m) {
        if (m > n - m) { 
            m = n - m;
        }

        long result = 1;
        for (int i = 0; i < m; i++) {
            result *= (n - i); 
            result /= (i + 1); 
        }
        return result;
    }
}
