package begin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/*
모음제거
* 영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
* 문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
*/
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution("nice to meet you"));
        System.out.println(solution_1("nice to meet you"));
        System.out.println(solution_2("nice to meet you"));
    }

    // myString 이 바뀔때 마다 길이가 변해서 for문의 동작 수가 바뀜;
    // 1. 새로운 문자열을 생성. StringBuilder() 로..
    public static String solution(String my_string){
        StringBuilder answer = new StringBuilder();
        List<String> vowelList = Arrays.asList("a", "e", "i", "o", "u");

        for (int i=0; i<my_string.length(); i++){
            String iChar = Character.toString(my_string.charAt(i));
            if(!vowelList.contains(iChar)){
                answer.append(iChar);
            }
        }





        return answer.toString();
    }

    // 2. 모음 List 에서 향상된 for 문을 사용.
    public static String solution_1(String my_string){
        String answer = "";
        List<String> vowelList = Arrays.asList("a", "e", "i", "o", "u");

        for (String v: vowelList){
            my_string = my_string.replace(String.valueOf(v), "");
        }
        answer = my_string;
        return answer;
    }

    // 3. 한번에 제거. (정규식 사용)
    public static String solution_2(String my_string){
        String answer = "";
        answer = my_string.replaceAll("[aeiou]", "");
        return answer;
    }
}
