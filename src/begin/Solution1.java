package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


/*
    [k의 개수]
    1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
    정수 i, j, k가 매개변수로 주어질 때,
    i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
 */
// 4점 획득. 단번에 통과!
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution(1, 13, 1));
        System.out.println(solution(10, 50, 5));
        System.out.println(solution(3, 10, 2));
    }

    public static int solution (int i, int j, int k){
        int answer = 0;
        for(int num=i; num<=j; num++){
            int count = (int) Arrays.stream((num + "").split(""))
                    .filter(x -> x.contains(k + "")).count();
            answer += count;
        }
        return answer;
    }



}
