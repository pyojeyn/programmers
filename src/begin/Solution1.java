package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    [저주의 숫자 3]
3x 마을 사람들은 3을 저주의 숫자라고 생각하기 때문에 3의 배수와 숫자 3을 사용하지 않습니다. 3x 마을 사람들의 숫자는 다음과 같습니다.
정수 n이 매개변수로 주어질 때, n을 3x 마을에서 사용하는 숫자로 바꿔 return하도록 solution 함수를 완성해주세요.
 */

// 5점!!




public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution(15));
        System.out.println(solution(40));
    }


    public static int solution(int n){
        Map<Integer, Integer> number3xMap = new HashMap<>();
        // i: 10진숫자, j: 3x마을 숫자
        int i = 1;
        int j = 1;
        while (i < 101){

            while ((j % 3 == 0 || String.valueOf(j).contains("3"))){
                j++;
            }
            number3xMap.put(i, j);
            i++;
            j++;
        }
        return number3xMap.get(n);
    }
}

