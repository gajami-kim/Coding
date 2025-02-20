class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int last = num_list[num_list.length-1];
        int minus = num_list[num_list.length-2];
        
        for(int i=0; i<num_list.length; i++){
            answer[i] = num_list[i];
        }
        
        answer[num_list.length] = last > minus ? last-minus : last*2;
        
        return answer;
    }
}