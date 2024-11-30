package begin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

// 중복된 숫자개수
/* 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때,
array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요. */
public class Solution1 {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,5};
        System.out.println(solution(arr, 1));

    }

    public static int solution(int[] array, int n){
        int answer = 0;

        answer = (int) Arrays.stream(array).filter(a -> a == n).count();

        return answer;
    }
}
