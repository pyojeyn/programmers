package begin;

import java.util.*;


/*
    [A로 B만들기]
    문자열 befor 와 after 가 매개변수로 주어질 때, before의 순서를 바꾸어 after를 만들 수 있으면 1을,
    만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요
 */

// oh~ 9점 획득!
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution("olleh", "hello"));
        System.out.println(solution("allpe", "apple"));
        System.out.println(solution("aba", "aab"));
    }



    // 문제의 조건은 before의 순서를 "어떻게든" 바꿔 after를 만들 수 있으면 1을 반환해야 한다는 것
    public static int solution(String before, String after){
        char[] beforeCharArr = before.toCharArray();
        Arrays.sort(beforeCharArr);
        char[] afterCharArr = after.toCharArray();
        Arrays.sort(afterCharArr);
        System.out.println("정렬하고 나서 : " + Arrays.equals(beforeCharArr, afterCharArr));

        // 개선점. 이건 불필요한 연산이다.
//        for (int i=0; i<before.length(); i++){
//            if(!(beforeCharArr[i] == afterCharArr[i])){
//                answer = 0;
//            }
//        }

        // Arrays.equals() : 두 배열의 길이, 순서, 그리고 값까지 모두 비교.
        return Arrays.equals(beforeCharArr, afterCharArr) ? 1 : 0;
    }

}
