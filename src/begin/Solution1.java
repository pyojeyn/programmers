package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


/*
    [문자열 정렬하기 (1)]
    문자열 my_string이 매개변수로 주어질 때,
    my_string 안에 있는 숫자만 골라 오름차순 정렬한 리스트를 return 하도록 solution 함수를 작성해보세요.
 */
public class Solution1 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution("p2o4i8gj2")));


    }

    public static int[] solution(String my_string){
        String[] newMyString2 = my_string.replaceAll("[^0-9]", "").split("");
        int[] answer = new int[newMyString2.length];

        for(int i=0; i<newMyString2.length; i++){
           answer[i] = Integer.parseInt(newMyString2[i]);
        }

        Arrays.sort(answer);

       return answer;

    }
}
