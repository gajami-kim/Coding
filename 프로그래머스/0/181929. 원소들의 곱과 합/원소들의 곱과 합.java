class Solution {
    public int solution(int[] num_list) {
        int mul = 1;
        int squ = 0;
        
        for(int num : num_list) {
            mul *= num;
            squ += num;
        }
        
        return mul > Math.pow(squ,2) ? 0 : 1;
    }
}