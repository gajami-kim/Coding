class Solution {
    public String solution(String code) {
        StringBuilder answer = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = (mode == 0) ? 1 : 0;
            } else {
                if ((mode == 0 && i % 2 == 0) || (mode == 1 && i % 2 == 1)) {
                    answer.append(code.charAt(i));
                }
            }
        }

        return answer.length() == 0 ? "EMPTY" : answer.toString();
    }
}
