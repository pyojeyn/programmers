package begin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

// 배열 뒤짚기.
public class Solution1 {
    public static void main(String[] args) {
        int[] arrInt = {1, 2, 3, 4, 5, 10};
        System.out.println(Arrays.toString(solution(arrInt)));
        System.out.println(Arrays.toString(solution_2(arrInt)));
        System.out.println(Arrays.toString(solution_3(arrInt)));
    }

    // 내가 한거
    public static int[] solution(int[] num_list) {
        int sizeOfNumList = num_list.length;
        int[] answer = new int[sizeOfNumList]; // 최종 반환해줄 배열. num_list 와 동일한 길이로 초기화

        boolean isValid = (num_list.length >= 1 && num_list.length <= 1000);

        if(isValid) {
            // size -- 하면 size 값이 변동되므로 배열 끝까지 출력 못해서 별도의 카운트다운 변수를 만들어줌.
            // int cntDownSize = sizeOfNumList; // 개선점 -> num_list[sizeOfNumList - 1 - i]; 로 해결
            for(int i=0; i<sizeOfNumList; i++){
                answer[i] = num_list[sizeOfNumList - 1 - i]; // 배열 끝자리값부터 역순으로 입력해줘야 하니 마지막 인덱스 -1 부터 조회하고 대입해줌.
                // cntDownSize--;
            }
        }
        return answer;
    }

    // 다른 사람 풀이1
    public static int[] solution_2(int[] num_list) {
        return LongStream.range(1, num_list.length + 1)
                .mapToInt(i -> num_list[(int) (num_list.length - i)])
                .toArray();
    }

    // 다른 사람 풀이2
    public static int[] solution_3(int[] num_list) {
        int[] answer = new int[num_list.length];
        int startIdx = 0;
        for(int i = num_list.length-1; i>=0; i--){
            answer[startIdx] = num_list[i];
            startIdx++;
        }
        return answer;
    }


    // 다른 사람 풀이3
    public static int[] solution_4(int[] numList) {
        List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
