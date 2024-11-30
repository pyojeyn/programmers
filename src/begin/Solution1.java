package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/*
약수구하기
* 정수 n이 매개변수로 주어질 때,
* n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
* */
public class Solution1 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(24)));
    }

    public static int[] solution(int n){
        List<Integer> tmpList = new ArrayList<>();


        for(int i=1; i<=n; i++){
            if(n % i == 0){
                tmpList.add(i);
            }
        }
        int[] answer = tmpList.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);

        return  answer;
    }
}
