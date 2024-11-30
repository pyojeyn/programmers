package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


/*
    최대값 만들기(2)
    정수 배열 numbers가 매개변수로 주어집니다.
    numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 */
public class Solution1 {
    public static void main(String[] args) {

        System.out.println(solution(new int[]{0, 0, 1, 0, 9}));
//        System.out.println(solution(new int[]{-20, 1, 1, 4, -5}));
//        System.out.println(solution(new int[]{1, 2, -3, 4, -5}));
//        System.out.println(solution(new int[]{0, -31, 24, 10, 1, 9}));
//        System.out.println(solution(new int[]{10, 20, 30, 5, 5, 20, 5}));


    }

    public static int solution(int[] numbers){
        int answer = 0;

        // ** 정렬이 가능한지 먼저 떠올리기.
        // 정렬.
        Arrays.sort(numbers);

        // 가장 큰 두 양수의 곱
        int pMax = numbers[numbers.length -1] * numbers[numbers.length -2];
        // 가장 작은 두 음수의 곱
        int nMax = numbers[0] * numbers[1];

        answer = Math.max(pMax, nMax);
        return answer;
    }
}
