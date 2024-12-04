package begin;

import java.util.*;
import java.util.concurrent.Semaphore;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


/*
    [가까운 수]
    정수 배열 array와 정수 n이 매개변수로 주어질 때, array에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록 solution 함수를 완성해주세요.
 */



public class Solution1 {
    public static void main(String[] args) {
//        System.out.println(sulution_1(new int[]{3, 10, 28}, 20));
//        System.out.println(sulution_1(new int[]{10, 11, 12}, 13));
//        System.out.println(sulution_1(new int[]{2, 4, 6}, 5));

        System.out.println("가장 큰 값이어라");
        System.out.println(findMaxValue(new int[]{3, 10, 28}));
        System.out.println(findMaxValue(new int[]{10, 11, 12}));
        System.out.println(findMaxValue(new int[]{2, 4, 6}));

        System.out.println("=========================================");
        System.out.println("가장 작은 값이어라");

        System.out.println(findMinValue(new int[]{3, 10, 28}));
        System.out.println(findMinValue(new int[]{10, 11, 12}));
        System.out.println(findMinValue(new int[]{2, 4, 6}));



    }


    // 15점.......
    public static int sulution_1(int[] array, int n){

        /* 배열을 내에서 값을 비교할 때 첫번째 값을 기준으로 초기화하는 방법이 안전함. */
        int answer = array[0];  // 초기값을 첫 번째 원소로 설정
        int minDiff = Math.abs(array[0] - n);  // 첫 번째 값과 n의 차이

        for (int i = 1; i < array.length; i++) {
            int diff = Math.abs(array[i] - n);

            // 더 작은 차이를 찾으면 해당 값으로 업데이트
            // 차이가 같으면 더 작은 값을 선택
            // if 문에 안든다면 먼저 초기화한 값이 최종 리턴값이 되는것임.
            if (diff < minDiff || (diff == minDiff && array[i] < answer)) {
                minDiff = diff;
                answer = array[i];
            }
        }

        return answer;
    }


    // 비슷한 기본 문제
    // 배열중에서 가장 큰 값 찾기기
    public static int findMaxValue(int[] array) {
        int maxValue = array[0];  // 배열의 첫 번째 값으로 초기화

        for (int i = 1; i < array.length; i++) {  // 두 번째 값부터 비교
            if (array[i] > maxValue) {
                maxValue = array[i];  // 더 큰 값이 있으면 갱신
            }
        }

        return maxValue;  // 최종적으로 가장 큰 값 반환
    }

    // 비슷한 기본 문제
    // 배열중에서 가장 작은 값 찾기기
    public static int findMinValue(int[] array) {
        int minValue  = array[0];  // 배열의 첫 번째 값으로 초기화

        for (int i = 1; i < array.length; i++) {  // 두 번째 값부터 비교
            if (array[i] < minValue ) {
                minValue  = array[i];  // 더 큰 값이 있으면 갱신
            }
        }

        return minValue ;  // 최종적으로 가장 큰 값 반환
    }


}
