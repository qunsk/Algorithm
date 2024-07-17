class Solution {
    public int solution(int hp) {
        int general = 5;
        int soldier = 3;
        int worker = 1;
        
        int numGeneral = hp / general;
        hp %= general;
        
        int numSoldier = hp / soldier;
        hp %= soldier;
        
        int numWorker = hp / worker;
        
        return numGeneral + numSoldier + numWorker;
    }
}