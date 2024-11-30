package begin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

// 배열 2배 만들기!
/*
 * 정수 배열 numbers 가 매개변수.
 * numbers 의 각 원소에 두배한 원소를 가진 배열을 return 하도록 solution 함수를 완성하기.
 * */
public class Solution1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7};
        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] numbers){

        int[] answer = Arrays.stream(numbers)
                .map(i -> i*2).toArray();
        return answer;
    }
}
