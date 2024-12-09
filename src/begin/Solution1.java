package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    [문자열 계산하기]
     my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 문자열 my_string이 매개변수로 주어질 때,
     수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
 */
// 11점!!!!!!!
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution("3 + 5 - 2"));
        System.out.println(solution_1("3 + 5 - 2"));
    }


    public static int solution(String my_string){
        String[] myStringArr = my_string.split(" ");

        int answer = Integer.parseInt(myStringArr[0]);
        String operator = "";
        for (int i=1; i<myStringArr.length; i++) {
            if(myStringArr[i].equals("+") || myStringArr[i].equals("-")){
                operator = myStringArr[i];
                continue;
            }
            if(operator.equals("+")){
                answer = answer + Integer.parseInt(myStringArr[i]);
            }else if(operator.equals("-")){
                answer = answer - Integer.parseInt(myStringArr[i]);
            }
        }
        return answer;
    }

    // 리팩토링 해봅시다.
    public static int solution_1(String my_string){
        String[] myStringArr = my_string.split(" ");
        int answer = Integer.parseInt(myStringArr[0]); // 초기값. 맨 처음 숫자

        for(int i=1; i<myStringArr.length; i += 2){ // 연산자 위치만 탐색. 연산자는 홀수 인덱스에 위치해 있는다. 그래서 1부터 시작해서 2씩 증감.
            String operator = myStringArr[i];
            int number = Integer.parseInt(myStringArr[i+1]); // 숫자는 연산자 다음 위치.
            answer += operator.equals("+") ? number : -number;
        }

        return answer;
    }
}

