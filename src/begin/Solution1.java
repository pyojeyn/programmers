package begin;

import java.util.stream.IntStream;

// 짝수의 합
public class Solution1 {

    public static void main(String[] args) {
        System.out.println(solution(6));
        System.out.println(solution_2(6));
    }


    // mine
    public static int solution(int n) {
        int answer = 0;

        boolean isValid = (n > 0 && n <= 1000);

        if(isValid){
            for(int i = 1; i <= n; i++){
                if(i % 2 == 0){
                    answer += i;
                }
            }
        }
        return answer;
    }

    // others
    public static int solution_1(int n) {
        int answer = 0;
        for(int i=2; i<=n; i+=2){
            answer+=i;
        }

        return answer;
    }


    public static int solution_2(int n) {
        return IntStream.rangeClosed(0, n)
                .filter(e -> e % 2 == 0)
                .sum();
    }
}
