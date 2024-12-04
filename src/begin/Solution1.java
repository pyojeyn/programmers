package begin;

import java.util.*;
import java.util.concurrent.Semaphore;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


/*
    [숨어있는 숫자의 덧셈 (2)]
    문자열 my_string이 매개변수로 주어집니다.
    my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 */

// 9점 획득!!

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123Z"));

    }

    public static int solution (String my_string){

        // 하나 이상의 연속숫자들을 찾는 정규식 패턴.
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(my_string);

        List<Integer> numbers = new ArrayList<>();

        // 매개변수 문자열에서 정규식 패턴과 일치하는 부분을 찾는다.
        while (matcher.find()){
            numbers.add(Integer.parseInt(matcher.group()));
        }
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }



}
