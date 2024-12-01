package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


/*
    [문자열 정렬하기]
    영어 대소문자로 이루어진 문자열 my_string이 매개변수로 주어질 때,
    my_string을 모두 소문자로 바꾸고 알파벳 순서대로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
 */
// 1점 획득. 단번에 통과.
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution("Bcad"));
        System.out.println(solution("heLLo"));
        System.out.println(solution("Python"));
    }

    public static String solution(String my_string){
        String lowerCase = my_string.toLowerCase();
        char[] lowerCaseCharArr = lowerCase.toCharArray();
        Arrays.sort(lowerCaseCharArr); //  ASCII 값 순서로 정렬
        return String.valueOf(lowerCaseCharArr);
    }


}
