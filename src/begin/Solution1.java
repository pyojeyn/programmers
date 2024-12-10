package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    [팩토리얼]
    i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다.
    예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다.
    정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
 */
// 3점!! 이건 좀 뿌듯하네 ㅋ


public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution(3628800));
        System.out.println(solution(7));
        System.out.println(solution(6));
        System.out.println(solution(24));
        System.out.println(solution(1));
        System.out.println(solution(5));
    }


    public static int solution(int n){
        int factorialNum = 1;
        while (n > 1 && factorialNum < n){
            factorialNum++;
            n /= factorialNum;
        }
        return factorialNum;
    }
}

