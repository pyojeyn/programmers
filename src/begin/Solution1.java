package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


/*
    숫자 찾기
    정수 num과 k가 매개변수로 주어질 때,
    num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고
    없으면 -1을 return 하도록 solution 함수를 완성해보세요.
 */
// 단번에 통과
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution(29183, 1));
        System.out.println(solution(232443, 4));
        System.out.println(solution(123456, 7));

    }

    public static int solution(int num, int k){
        int answer = -1;
        String numStr = num + "";
        String[] arr = numStr.split("");

        for(int i=0; i<numStr.length(); i++){
            int iNum = Integer.parseInt(arr[i]);
            if(iNum == k){
                answer = i + 1;
                break;
            }
        }


        return answer;
    }


}
