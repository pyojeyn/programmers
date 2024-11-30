package begin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/*
최대값 만들기(1)
* 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소 중
* 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
* */
public class Solution1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println(solution(numbers));
    }

    public static int solution(int[] numbers){
        int answer = 0;
        // 참조형 배열 생성
        Integer[] numbersWrapper = new Integer[numbers.length];

        // 참조형 배열 초기화
        for(int i=0; i<numbers.length; i++){
            numbersWrapper[i] = numbers[i];
        }


        // 내림차순 정렬
        Arrays.sort(numbersWrapper, Collections.reverseOrder());

        // 곱함.
        answer = numbersWrapper[0] * numbersWrapper[1];
        return answer;
    }
}
