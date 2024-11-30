package begin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

// 양꼬치
public class Solution1 {
    public static void main(String[] args) {
        int howMuch = solution(64, 6);

        System.out.println("howMuch?" + howMuch);
        int a = 9;
        int b = 10;
        System.out.println(a/b);
    }
    public static int solution(int n, int k) {
        // n : 양꼬치
        // k : 음료수
        // 10인분 먹었을 시 음료수1개 꽁짜.
        int answer = 0;

        // 내가 푼 것.
//        if(n >= 10){
//            int howFreeDrink = n / 10;
//            answer =  (12000 * n) + (2000 * (k - howFreeDrink));
//        }else{
//            answer = (12000 * n) + (2000 * k);
//        }

        // 개선 -> 정수 나눗셈이므로 10보다 작은수를 10으로 나누면 0 이 되므로.
        // 아래처럼 if문 필요 없이 바로 10으로 나눠서 반환해주면 된다.
        answer = 12000 * n + (k - n/10) * 2000;


        return answer;
    }
}
