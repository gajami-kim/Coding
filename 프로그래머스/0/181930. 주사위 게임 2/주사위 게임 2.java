class Solution {
    public int solution(int a, int b, int c) {
        int answer = a+b+c;
        int answer2 = answer*(int)(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
        int answer3  = answer2*(int)(Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3));
            
        if (a != b && b != c && a != c) {
            return answer;
        } else if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
            return answer2;
        } else {
            return answer3;
        }
    }
}