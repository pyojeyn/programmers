package begin;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    [다음에 올 숫자]
    등차수열 혹은 등비수열 common이 매개변수로 주어질 때,
    마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.

    ** 등차수열 : 차례대로 일정한 수를 더해서 얻어지는 수열 +
    ** 등비수열 : 첫째항부터 차례대로 일정한 수를 곱해서 얻어지는 수열 *
 */

// 4점
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1,2,3,4}));
        System.out.println(solution(new int[]{2,4,8}));
    }


    public static int solution(int[] common){
        boolean arithmeticSequence = common[1] - common[0] == common[2] - common[1];

        return arithmeticSequence ? common[common.length - 1] + common[1] - common[0] : common[common.length - 1] * common[1] / common[0];
    }






}

