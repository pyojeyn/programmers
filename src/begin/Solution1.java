package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/*
숨어있는 숫자의 덧셈(1)
* 문자열 my_string이 매개변수로 주어집니다.
* my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
* */
public class Solution1 {

    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
    }

    public static int solution(String my_string){
        int answer = 0;
        char[] charArr = my_string.toCharArray();

        for (char c : charArr) {
            if(String.valueOf(c).matches("^[0-9]*$")){
                answer += Integer.parseInt(String.valueOf(c));
            };
        }
        return answer;
    }

    // "^[0-9]*$"
    // ^ : 문자열의 시작
    // * : 0번 이상 반복
    // $ : 문자열의 끝끝


    // 다른 사람 풀이.
    public static int solution_1(String my_string){
        int answer = 0;

        // 숫자빼고 다 지움.
        String str = my_string.replaceAll("[^0-9]", "");

        for(char ch: str.toCharArray()){
            answer += Character.getNumericValue(ch);
        }

        return answer;
    }






    // ===
    // "[^0-9]"의 의미:
    // [^...] 대괄호 안에 있는 문자들을 제외한 것에  일치.
    // 0-9 : 숫자 0~9 의 범위.
}
