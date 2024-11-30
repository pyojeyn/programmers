package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

// n 의 배수 고르기.
// 정수 n과 정수 배열 numlist가 매개변수로 주어질 때,
// numlist에서 n의 배수가 아닌 수들을 제거한 배열을 return하도록
// solution 함수를 완성해주세요.
public class Solution1 {


    /*
    n	numlist	                        result
    3	[4, 5, 6, 7, 8, 9, 10, 11, 12]	[6, 9, 12]
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})));
    }
    public static int[] solution(int n, int[] numlist){

        int[] answer = Arrays.stream(numlist)
                .filter(num -> num % n == 0)
                .toArray();

        return answer;
    }
}
