package begin;

import java.util.*;
import java.util.stream.Collectors;


/*
    [이진수 더하기]
     이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때,
     두 이진수의 합을 return 하도록 solution 함수를 완성해주세요.
 */
// Oh... 7점???
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution("10", "11"));
    }


    public static String solution(String bin1, String bin2){
        int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(sum);
    }

}
