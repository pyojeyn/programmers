package begin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

// 머쓱이보다 키 큰 사람
/* 머쓱이네 반 친구들의 키가 담긴 정수 배열 array와
머쓱이의 키height가 매개변수로 주어질 때,
머쓱이보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요. */
public class Solution1 {
    public static void main(String[] args) {
        int[] classFHeights = {149, 180, 192, 170};

        System.out.println(solution(classFHeights, 167));
    }

    public static int solution(int[] array, int height){
        int answer = 0;

        answer = (int) Arrays.stream(array)
                .filter(a -> a > height).count();

        return answer;
    }
}
