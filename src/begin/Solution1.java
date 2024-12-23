package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    [다항식 더하기]
    한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
    다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
    덧셈으로 이루어진 다항식 polynomial이 매개변수로 주어질 때,
    동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.
    같은 식이라면 가장 짧은 수식을 return 합니다.
 */

// 12점 !!!!

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution("3x + 7 + x"));
        System.out.println(solution("x + x + x"));
        System.out.println(solution("x + 5"));
        System.out.println(solution("x"));

    }


    public static String solution(String polynomial){
        StringBuilder answer = new StringBuilder();
        polynomial = polynomial.replaceAll(" ", "");
        String[] polynomialArr = polynomial.split("\\+");


        int xCnt = 0;
        int numCnt = 0;
        for(int i=0; i<polynomialArr.length; i++){
            if (polynomialArr[i].contains("x")){
                // nX 중에서 숫자만 추출(n만추출)
                String term = polynomialArr[i].replaceAll("[^0-9]", "");
                // 'x'만 있는 경우는 1을 계수로 추가
                xCnt +=  term.isEmpty() ? 1 : Integer.parseInt(term);
            }else{
                numCnt += Integer.parseInt(polynomialArr[i]);
            }
        }


        // 이 코드는 너무 길다.
//        if(xCnt > 0 && numCnt > 0){ /*  x항, 상수항 둘다 있을 때*/
//            if (xCnt > 1){
//                answer.append(xCnt);
//            }
//
//            // 계수가 1일때는 1 생략
//             answer.append("x")
//                    .append(" + ")
//                    .append(numCnt);
//        }else if(xCnt > 0){ /*  x항만 있을 때*/
//
//            // 계수가 1일때는 1 생략
//            if (xCnt > 1) answer.append(xCnt);
//
//            answer.append("x");
//        }else{ /*  상수항만 있을 때*/
//            answer.append(numCnt);
//        }

        if(xCnt > 0){
            answer.append(xCnt > 1 ? xCnt + "x" : "x");
        }
        if(numCnt > 0){
            if(xCnt > 0) answer.append(" + "); // 상수항만 있을때는 + 이 붙으면 안되므로.
            answer.append(numCnt);
        }

        return answer.toString();
    }











}

