package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


// 제곱수 판별하기
// 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
// 정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록
// solution 함수를 완성해주세요.
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution(27));
        System.out.println(solution2(27));
    }

    // 다른 사람 풀이
    public static int solution2(int n) {
        for(int i=0; i<= 1000; i++) {
            if(i*i == n )
                return 1;
        }
        return 2;
    }

    // 나의 풀이..
    //  핑계를 대자면.. 거듭제곱도 같이 생각해서 코드가 길어졌다...
    public static int solution(int n){
        int answer = 2;

        List<Integer> tmp = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                tmp.add(i);
            }
        }

        for (Integer num : tmp) {
            if (num*num == n){
                answer = 1;
            }
        }

        return answer;
    }
}
