package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


/*
    [중복된 문자 제거]
    문자열 my_string이 매개변수로 주어집니다.
    my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을
    return하도록 solution 함수를 완성해주세요.
 */
// 1점 획득.
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution("people"));
    }

    public static String solution (String my_string){
        Set<Character> finalSet = new HashSet<>();

        StringBuilder answer = new StringBuilder();
        for (char c : my_string.toCharArray()){
            if(finalSet.add(c)){
                answer.append(c);
            }
        }
        return answer.toString();
    }



}
