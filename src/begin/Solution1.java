package begin;

import java.util.*;
import java.util.stream.Collectors;


/*
    [컨트롤 제트] - 이거 아직 해결 못함....
    숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다.
    문자열에 있는 숫자를 차례대로 더하려고 합니다.
    이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다.
    숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.
 */

// 1점 획득.
public class Solution1 {
    public static void main(String[] args) {
        System.out.println("*답= " + solution("1 2 Z 3"));
        System.out.println("=============================================");
        System.out.println("*답= " + solution("10 20 30 40"));
        System.out.println("=============================================");
        System.out.println("*답= " + solution("10 Z 20 Z 1"));
        System.out.println("=============================================");
        System.out.println("*답= " + solution("10 Z 20 Z"));
        System.out.println("=============================================");
        System.out.println("*답= " + solution("-1 -2 -3 Z"));
        System.out.println("=============================================");
        System.out.println("*답= " + solution("-1 -2 -233 Z"));

        String[] test = "".split("\\s+");
        System.out.println("test의 길이 = " + test.length);
    }



    // 어렵네.......?
    // 정규식으로 어찌저찌 풀었는데 이건 진짜 아닌듯;
//    public static int solution(String s){
//        int answer = 0;
//        String[] filtered = s.replaceAll("-?\\d+ Z", "").trim().split("\\s+");
//        System.out.println(Arrays.toString(filtered));
//
//        if(filtered.length > 0 && !filtered[0].equals("")){
//            answer = Arrays.stream(filtered).mapToInt(Integer:: parseInt).sum();
//        }
//
//        return answer;
//    }

    // 이 문제는 STACK 문제임.
    // LIFO(Last In First Out) : 마지막에 삽입된 자료가 가장 먼저 삭제된다.
    /*
    * 1. push : 데이터를 스택에 넣는다.
    * 2. pop : 스택의 맨 위 데이터를 꺼내고 제거한다.
    * 3. peek : 스택의 맨 위 데이터를 제거하지 않고 확인한다.
    * 4. isEmpty : 스택이 비어 있는지 확인한다.
    */
    public static int solution(String s){
        String[] sArr = s.split(" ");
        System.out.println(Arrays.toString(sArr));
        Stack<Integer> stack = new Stack<>();
        for (String st : sArr) {
            // Z는 처음부터 시작하지 않으므로 무조건 처음엔 숫자이고 아래 조건문에 들어올땐 이전 값이 존재함.
            // 그래서  && !stack.isEmpty() 이건 안해줌.
            if(st.equals("Z")){
                // "Z"인 경우, 스택의 마지막 값 제거
                stack.pop();
            }else{
                // 숫자인 경우, 스택에 추가
                stack.push(Integer.parseInt(st));
            }
        }

        return stack.stream().mapToInt(Integer::intValue).sum();
    }

}
