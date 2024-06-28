class Solution {
    public int solution(int slice, int n) {
        int pizzaBox = (n + slice - 1) / slice;
        return pizzaBox;
    }
}