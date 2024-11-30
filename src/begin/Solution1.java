package begin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

// 짝수 홀수 개수 구하기
public class Solution1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(Arrays.toString(solution_1(arr)));
    }


    // mine
    public static int[] solution(int[] num_list){
        int evenCnt = 0;
        int oddCnt = 0;
        for(int i=0; i<num_list.length; i++){
            int num = num_list[i];
            if(num % 2 ==0){
                evenCnt++;
            }else{
                oddCnt++;
            }
        }

        return new int[]{evenCnt, oddCnt};
    }

    // others
    public static int[] solution_1(int[] num_list){
        return IntStream.of((int) Arrays.stream(num_list).filter(i -> i % 2==0).count(),
                (int) Arrays.stream(num_list).filter(i -> i % 2 ==1).count()).toArray();
    }
}
