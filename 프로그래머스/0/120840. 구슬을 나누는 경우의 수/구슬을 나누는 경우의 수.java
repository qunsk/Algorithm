class Solution {
    public int solution(int balls, int share) {
        return combination(balls, share);
    }
    
    public static int combination(int balls, int share){
        // Base Case: 고르는 개수가 0이거나 모든 구슬을 다 고를 때
        if(balls == share || share == 0) return 1; // 경우의 수는 1
        
        // 현재 구슬을 선택하거나 선택하지 않는 두 가지 경우를 더해주며 재귀 호출
        return combination((balls -1), (share -1)) + combination(balls - 1, share);
    }
}