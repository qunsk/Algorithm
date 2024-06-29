class Solution {
    public int[] solution(int money) {
        int pricePerCup = 5500;
        
        // 최대 마실 수 있는 잔 수
        int maxCups = money / pricePerCup;
        
        // 남는 돈
        int remainingMoney = money % pricePerCup;
        
        // 결과 배열에 잔 수와 남는 돈을 담아 반환
        return new int[] { maxCups, remainingMoney };
    }
}