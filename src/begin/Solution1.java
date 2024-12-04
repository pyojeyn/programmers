package begin;

import java.util.*;
import java.util.concurrent.Semaphore;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


/*
    [진료 순서 정하기]
    외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
    정수 배열 emergency가 매개변수로 주어질 때 응급도가 높은 순서대로 진료 순서를 정한 배열을 return하도록 solution 함수를 완성해주세요.
 */

// 1점 획득.

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{3, 76, 24})));
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6, 7})));
        System.out.println(Arrays.toString(solution(new int[]{30, 10, 23, 6, 100})));
    }

    public static int[] solution (int[] emergency){

        // 기존 배열을 정렬해서 새로운 배열 만듬.
        int[] tmpArr = IntStream.of(emergency)
                .boxed()
                .sorted(Collections.reverseOrder()) // Collections.reverseOrder()와 같은 메서드는 객체(Integer) 타입에서만 사용할 수 있기 때문에 boxed() 메서드 사용
                .mapToInt(Integer::intValue)
                .toArray();

        // 순위 Map 을 만듬
        Map<Integer, Integer> rankMap = new HashMap<>();
        for(int i=0; i< emergency.length; i++){
            rankMap.put(tmpArr[i], i + 1);
        }

        for(int i=0; i< emergency.length; i++){
            emergency[i] = rankMap.get(emergency[i]);
        }

        return emergency;
    }



}
