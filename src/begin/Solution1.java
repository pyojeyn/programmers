package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    [문자열 밀기]
문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다.
이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때,
A를 밀어서 B가 될 수 있다면 밀어야 하는 최소 횟수를 return하고
밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
 */

// 8점!!!

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution_2("hello", "lohel"));
//        System.out.println(solution("apple", "elppa"));
//        System.out.println(solution("atat", "tata"));
//        System.out.println(solution("abc", "abc"));
    }


    public static int solution(String A, String B){
        int answer = -1; // 불가능할때의 값으로 초기화

        int pushCnt = 0;
        for(int i=0; i<A.length(); i++){
            if(A.equals(B)) { // 애초에 같으면 push 할 필요 없으니까 0 대입해주고 break.
                answer = 0;
                break;
            }
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);
            pushCnt++; // 한칸씩 밀때 마다 1씩 증가.
            if(A.equals(B)) { // 한칸씩 밀릴때마다 B랑 같은지 비교하고 같으면 민 횟수 대입해주고 break
                answer = pushCnt;
                break;
            }
        }
        return answer;
    }

    // 개선된 코드
    public static int solution_1(String A, String B){
        if(A.equals(B)){
            return 0; // A와 B가 처음부터 같으면 바로 0 반환
        }

        for(int pushCnt=1; pushCnt<A.length(); pushCnt++){
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);
            if(A.equals(B)){
                return pushCnt;
            }
        }

        return -1;
    }

    // others
    public static int solution_2(String A, String B) {
        String tempB = B.repeat(3);
        System.out.println("tempB= " + tempB);
        return tempB.indexOf(A);
    }











}

