package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


/*
    [합성수 찾기]
    약수의 개수가 세 개 이상인 수를 합성수라고 합니다.
    자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
 */


public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(15));
    }

    public static int solution (int n){
        List<Integer> more3 = new ArrayList<>();


       for(int i=1; i<=n; i++){
           int count = 0;
           for(int j=1; j*j <=i; j++){
               if(j*j == i) count++;
               else if(i % j == 0) count += 2;
           }
           /*
           * j가 i의 제곱근 이하인 값에 대해서만 약수를 확인하도록 제한.
           * 제곱근보다 큰 값에 대해서는 이미 짝을 이루는 약수가 찾아졌으므로 추가로 확인할 필요가 없다.
           * */
           if(count >= 3) more3.add(i);
       }

        return more3.size();
    }


}
