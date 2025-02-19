class Solution {
    public int solution(int[] num_list) {
        int multiply = 1;
        int square = 0;
        
        for(int i=0; i<num_list.length; i++) {
            multiply *= num_list[i];
            square += num_list[i];
        }
        square = (int)Math.pow(square,2);
        
        return multiply > square ? 0 : 1;
    }
}