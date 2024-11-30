package begin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

// 개미군단
public class Solution1 {

    public static void main(String[] args) {
        System.out.println(solution(23));
        System.out.println(solution_1(23));
    }

    // 5분 남기고 푼... 나의 지저분한.. 코드....
    public static int solution(int hp) {
        int answer = 0;

        if(hp / 5 > 0){
            answer += (hp / 5);
            if (hp % 5 >= 3){
                int aa = hp%5;
                answer += (aa / 3);
                if(aa % 3 > 0 ){
                    int bb = aa%3;
                    answer += bb;
                }
            }else{
                answer += hp%5;
            }
        }else if(hp / 3 > 0){
            answer += (hp / 3);
            int aa  = hp%3;
            if(aa >= 1){
                answer += hp%3;
            }
        }else{
            answer += hp;
        }

        return answer;
    }


    // more simple
    // 큰 단위부터 차례대로 나눠주면 되는 문제...
    public static int solution_1(int hp){
        int answer = 0;

        // 장군 개미 수 계산
        answer += hp/5;
        hp %= 5;

        // 병정 개미 수 계산
        answer += hp/3;
        hp%=3;

        // 일개미 수 계산
        answer += hp;

        return answer;
    }
}
