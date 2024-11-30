package begin;

import java.util.Arrays;
import java.util.stream.IntStream;

// 배열의 평균값
public class Solution1 {

    public static void main(String[] args) {
        int[] arrInt = {1, 2, 3, 4, 5};
        System.out.println(solution(arrInt));
        System.out.println(solution_1(arrInt));
    }

    public static double solution(int[] numbers) {
        double answer = 0;

        int sizeOfNumbers = numbers.length;

        for(int i = 0; i < sizeOfNumbers; i++){
            answer += numbers[i];
        }

        answer = answer / sizeOfNumbers;


        return answer;
    }


    public static double solution_1(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
