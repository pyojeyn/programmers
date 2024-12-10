package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    [구슬을 나누는 경우의 수]
        balls -> n, share -> m
        n! 나누기 (n-m)! * m!
        팩토리얼 관련 문제....
 */

// 11점..ㅎ

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution(5,3));
        System.out.println(solution(3,2));
        System.out.println(solution(30,29));
    }


    public static int solution(int balls, int share){

        if(balls == share) return 1;

        // 조합 계산 최적화: 분자와 분모를 순차적으로 나눔
        long result = 1;

        // 결국 나누는 횟수는 share 개수만큼이니까 share만큼 for문
       for (int i = 0; i < share; i++) {
            System.out.println("i=" + i);
            result *= (balls - i);  // 분자
            result /= (i + 1); // 분모
        }

        return (int) result;
    }
}

