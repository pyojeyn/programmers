package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


/*
 * 인덱스 바꾸기
 * 문자열 my_string과 정수 num1, num2가 매개변수로 주어질 때, my_string에서
 * 인덱스 num1과 인덱스 num2에 해당하는 문자를 바꾼 문자열을 return 하도록
 * solution 함수를 완성해보세요.
 * */
public class Solution1 {
    public static void main(String[] args) {
//        System.out.println(solution("AbcAbcA", "AAA"));
        System.out.println(changeIndex("hello", 1, 2));

    }

    public static int solution(String str1, String str2){
        return str1.contains(str2) ? 1 : 2;
    }

    public static String changeIndex(String my_string, int num1, int num2){
        String answer = "";
        char[] charArr = my_string.toCharArray();


        charArr[num1] = my_string.charAt(num2);
        charArr[num2] = my_string.charAt(num1);

        answer = String.valueOf(charArr);

        return answer;
    }
}
