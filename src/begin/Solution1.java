package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    [유한 소수 판별하기]
소수점 아래 숫자가 계속되지 않고 유한개인 소수를 유한소수라고 합니다.
분수를 소수로 고칠 때 유한소수로 나타낼 수 있는 분수인지 판별하려고 합니다.
유한소수가 되기 위한 분수의 조건은 다음과 같습니다.
    -> 기약분수로 나타내었을 때, 분모의 소인수가 2와 5만 존재해야 합니다.
두 정수 a와 b가 매개변수로 주어질 때, a/b가 유한소수이면 1을, 무한소수라면 2를 return하도록 solution 함수를 완성해주세요.
 */


// 10점!!
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution(12, 21));
        System.out.println(getGCD(12, 16));
        System.out.println(primeFactorization(24));
    }


    public static int solution(int a, int b){
        int answer = 0;
        /* 최대공약수 구하기 -> 유클리드 호제법 */
        int gcd = getGCD(a, b);
        b /= gcd;

        /* 소인수분해하기 */
        List<Integer> sosus = primeFactorization(b);

        /* 소수들 중 2와 5 이외의 숫자가 있는지에 대한 여부. */
        boolean existsOtherNumbers = sosus.stream().anyMatch(num -> num != 2 && num != 5);
        answer = existsOtherNumbers ? 2 : 1;
        return answer;
    }

    /* 유클리드 호제법 */
    // 두 수를 나눗셈 반복하여 나머지가 0이 될 때까지 계산 -> 마지막으로 나머지가 0이 되었을 때의 나누는 수가 최대공약수가 된다.
    public static int getGCD(int a, int b){
        while (b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    /* 소인수분해 */
    public static List<Integer> primeFactorization(int b){
        List<Integer> sosus = new ArrayList<>();
        for (int i=2; i<=b; i++){
            if(b % i == 0){
                while (b % i == 0){
                    b /= i; // i로 나눌 수 있을 때까지 나눔
                }
                sosus.add(i);
            }
        }

        return sosus;
    }








}

