package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    [특이한 정렬]
    정수 n을 기준으로 n과 가까운 수부터 정렬하려고 합니다.
    이때 n으로부터의 거리가 같다면 더 큰 수를 앞에 오도록 배치합니다.
    정수가 담긴 배열 numlist와 정수 n이 주어질 때
    numlist의 원소를 n으로부터 가까운 순서대로 정렬한 배열을 return하도록 solution 함수를 완성해주세요.
 */

// 2점

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5, 6}, 4)));
        System.out.println(Arrays.toString(solution(new int[]{10000,20,36,47,40,6,10,7000}, 30)));
    }


    public static int[] solution(int[] numlist, int n){
        int[] answer = {};


        // numlist 의 원소와 n과의 차이를 map에 저장.
        Map<Integer, Integer> numChai = new HashMap<>();
        for (int i=0; i<numlist.length; i++){
            int chai = Math.abs(n - numlist[i]);
            numChai.put(numlist[i], chai);
        }

        // Map을 List로 변환하여 정렬
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(numChai.entrySet());

        // value 기준 오름차순, value가 같으면 key 기준 내림차순 정렬
        list.sort((entry1, entry2) -> {
            int valueCompare = entry1.getValue().compareTo(entry2.getValue()); // 두 값의 대소 비교

            if (valueCompare == 0) {
                // value가 같으면 key를 내림차순으로 정렬
                return entry2.getKey().compareTo(entry1.getKey());
            }
            return valueCompare; // valueCompare이 0 이 아니라면 value 값으로 정렬
        });

/*        [compareTo의 결과와 동작]
        ** sort 메서드는 Comparator 인터페이스를 기반으로 동작하며,
           return 값이 음수/양수/0인지에 따라 두 값을 어떻게 정렬할지 결정합니다.
        * entry1.getValue().compareTo(entry2.getValue())는 두 값을 비교해서 다음과 같은 결과를 반환
        1. 음수 (-1 같은 값):
        entry1.getValue()가 entry2.getValue()보다 작다는 뜻입니다.
          → entry1이 entry2보다 앞에 위치. (첫 번째 값이 앞에)
        2. 0:
          두 값이 같다는 뜻입니다.
          → 두 요소의 순서는 바뀌지 않음.
        3. 양수 (1 같은 값):
        entry1.getValue()가 entry2.getValue()보다 크다는 뜻입니다.
          → entry1이 entry2보다 뒤로 이동. (두 번째 값이 앞에)

     * 요약
     * list.sort((a,b) -> <결과값>)
     * 1. <결과값> 은 음수/양수/0 을 반환하는 로직. (return은 항상 -1, 1, 0)
     * 2. 반환된 값에 따라 두 값의 순서를 결정.
     * 3. 양수, 음수 여부에 따라 정렬 순서가 오름차순인지 내림차순인지 결정됨.
     *
     *
     * sort(a,b)
     * -> b - a / b.compareTo(a) : 내림차순
     * -> a - b / a.compareTo(b) : 오름차순
     *

  */


       // key 값인 numlist 의 원소들을 배열에 저장.
        answer = list.stream()
                        .map(Map.Entry::getKey)
                        .mapToInt(x -> x)
                        .toArray();
        return answer;
    }











}

