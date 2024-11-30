package begin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

// 배열의 유사도
public class Solution1 {
    public static void main(String[] args) {
        String[] s1 = {"n", "omg"};
        String[] s2 = {"m", "dot"};

        System.out.println(solution(s1, s2));

    }

    public static int solution(String[] s1, String[] s2) {
        int answer = 0;

        answer = (int) Arrays.stream(s1).filter(e -> Arrays.stream(s2).anyMatch(e::equals)).count();
        return answer;
    }
}
