class Solution {
    public int solution(int price) {
        double discount = price >= 500000 ? 0.2 : (price >= 300000 ? 0.1 : (price >= 100000 ? 0.05 : 0));
        return (int)(price - price*discount);
    }
}