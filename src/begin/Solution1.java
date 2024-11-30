package begin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

// 피자 나눠먹기
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution_1(4,12));
    }

    // 피자 나눠먹기1
    public static int solution(int n) {
        double pizza = (double) n / 7;
        System.out.println(pizza);
        int answer = (int) Math.ceil(pizza);
        return answer;
    }

    // 피자 나눠먹기 3
    public static int solution_1(int slice, int n) {
        return (int) Math.ceil((double) n/slice);
    }

}
