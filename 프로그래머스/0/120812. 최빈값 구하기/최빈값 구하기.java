import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int solution(int[] array) {
        // 빈도 계산을 위한 HashMap
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // 배열의 각 요소의 빈도를 계산
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // 최대 빈도를 찾기
        int maxFrequency = 0;
        for (int frequency : frequencyMap.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        // 최대 빈도의 요소가 여러 개인지 확인
        int maxFrequencyCount = 0;
        int mode = -1;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                maxFrequencyCount++;
                mode = entry.getKey();
            }
        }

        // 최빈값이 여러 개면 -1 반환, 아니면 최빈값 반환
        if (maxFrequencyCount > 1) {
            return -1;
        } else {
            return mode;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 4};
        System.out.println(solution(array)); // 출력: -1
    }
}