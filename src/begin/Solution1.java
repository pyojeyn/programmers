package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


/*
    [배열 회전시키기]
    정수가 담긴 배열 numbers와 문자열 direction가 매개변수로 주어집니다.
    배열 numbers의 원소를 direction방향으로 한 칸씩 회전시킨 배열을 return하도록
    solution 함수를 완성해주세요

 */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3}, "right")));
        System.out.println(Arrays.toString(solution(new int[]{4, 455, 6, 4, -1, 45, 6}, "left")));

    }

    public static int[] solution(int[] numbers, String direction){

        // 1. int[] -> Integer[] 변환
//        Integer[] integerArray = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        // 2. Integer[] -> List<Integer> 변환
//        List<Integer> numberList = new ArrayList<>(Arrays.asList(integerArray));

        // 개선1. 배열 -> 리스트 변환 간소화
        List<Integer> numberList = Arrays.stream(numbers)
                .boxed().collect(Collectors.toList());

        if(!numberList.isEmpty()){
            if(direction.equals("right")){
                // 맨 마지막 값 제거, 제거하고 반환된 제거된 맨 마지막 값 변수에 대입
                int lastElement = numberList.remove(numberList.size() -1);
                // 대입한 변수 맨 앞에 세팅
                numberList.add(0, lastElement);
            }else{
                // 맨 앞자리 값 제거, 제거하고 반환된 제거된 맨 앞자리값 변수에 대입
                int firstElement = numberList.remove(0);

                // 맨 뒤에 넣어줌.
                // 현재 존재하는 제일 마지막 인덱스(numberList.size() -1) 에서 + 1 이므로
                // 맨 뒤에 새로운 값을 추가할때는 numberList.size() 가 맞다.
                numberList.add(numberList.size(), firstElement);
            }
        }
        return numberList.stream().mapToInt(Integer::intValue).toArray();
    }
}
