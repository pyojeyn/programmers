package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/*
배열자르기
* 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때,
* numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 return 하도록 solution 함수를 완성해보세요.
* */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, 1, 3)));
    }

    public static int[] solution(int[] numbers, int num1, int num2){

        List<Integer> tmp = new ArrayList<>();

        for(int i=0; i<numbers.length; i++){
            if(i >= num1 && i <= num2){
                tmp.add(numbers[i]);
            }
        }

        return tmp.stream().mapToInt(t -> t).toArray();
    }
}
