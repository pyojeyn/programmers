package begin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

// 분수의 덧셈
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(9, 2, 1, 3)));
    }




    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        // 두 분수의 합
        int numerator = numer1 * denom2 + numer2 * denom1; // 분자 합
        int denominator = denom1 * denom2; // 분모 곱 -> 분모의 최소 공배수

        // 분자와 분모를 약분
        int gcd = findGCD(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        System.out.println("분자: " + numerator);
        System.out.println("분모: " + denominator);
        answer[0] = numerator;
        answer[1] = denominator;
        return answer;
    }

    // 최대 공약수(GCD) 계산 함수
    // GCD : Greatest Common Divisor
    /*
     * 유클리드호제법
     * 2개의 자연수(또는 정식) a, b에 대해서 a를 b로 나눈 나머지를 r이라 하면(단, a>b),
     * a와 b의 최대공약수는 b와 r의 최대공약수와 같다.
     * 이 성질에 따라, b를 r로 나눈 나머지 r'를 구하고,
     * 다시 r을 r'로 나눈 나머지를 구하는 과정을 반복하여 나머지가 0이 되었을 때,
     * 나누는 수가 a와 b의 최대공약수이다.
     * */
    private static int findGCD(int numerator, int denominator){
        while (denominator != 0){
            int tmp = denominator;
            denominator = numerator % denominator;
            numerator = tmp;

        }
        return numerator;
    }
}
