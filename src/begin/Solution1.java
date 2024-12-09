package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    [삼각형의 완성조건(2)]
     선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.


 */
// 2점


public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 6}));
        System.out.println(solution(new int[]{1, 2}));
        System.out.println(solution(new int[]{11, 7}));
    }


    public static int solution(int[] numbers){
        int answer = 0;
        // 가장 긴 길이가 6일때.
        int more = Arrays.stream(numbers).max().getAsInt() - Arrays.stream(numbers).min().getAsInt();
//        int x = 0;
//        x > 6 - 3 ;

        // 가장 긴 길이가 나머지 한변 일때.
        int less = numbers[0] + numbers[1];
//        x < 6+3


        for(int i=more+1; i<less; i++){
            answer++;
        }
       return answer;
    }





}

