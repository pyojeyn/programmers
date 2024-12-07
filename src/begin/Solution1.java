package begin;

import java.util.*;
import java.util.stream.Collectors;


/*
    [소인수분해]
     소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
     예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
     따라서 12의 소인수는 2와 3입니다.
     자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을
     return 하도록 solution 함수를 완성해주세요.
 */

// OH!!!!!!!!!!!!!!!!!!!!!!!!!! 9점 획득입니다!
// 수학관련이라 어려웠는데 뿌듯하다.
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution( 17)));
    }


    public static int[] solution(int n){

        // 개선점. 중복제거니까 List 를 안쓰고 Set 을 써도 됬다. 그러머 distinct 도 필요없다.
        List<Integer> soinsuList = new ArrayList<>();

        // 소수는 2부터 시작.
        int sosu = 2;

        // n 이 1이 될때까지 무한 반복문.
        while (!(n == 1)){
            // 매개변수와 소수의 나머지가 0으로 떨어질때.
            if(n%sosu==0){
                // 소수를 리스트에 추가
                soinsuList.add(sosu);
                // n을 소수로 나눈 값으로 대입.
                n = n/sosu;
            }else sosu++; // 매개변수와 소수의 나머지가 0으로떨어질때까지 소수의 값을 1씩 늘려줌.

        }
        return soinsuList.stream().distinct().mapToInt(Integer::intValue).toArray();
    }

}
