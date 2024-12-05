package begin;

import java.util.*;


/*
    [한 번만 등장한 문자]
    문자열 s가 매개변수로 주어집니다.
    s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요.
    한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
 */

// 2점 획득

public class Solution1 {
    public static void main(String[] args) {
//        System.out.println(solution("abcabcadc"));
//        System.out.println(solution("abcd"));
//        System.out.println(solution("hello"));

        System.out.println(solution_1("hello"));
    }



    public static String solution(String s){
        StringBuilder answer = new StringBuilder();

        // 개선필요점1. split 은 정규식을 사용하여 문자열을 분리하므로, 성능이 상대적으로 느릴 수 있다.
        // 문자열을 toCharArray() 로 변환하여 문자를 바로 다루는 것이 더 효율적이래
        String[] sArr = s.split("");

        for(int i=0; i<s.length(); i++){
            String s1 = sArr[i];
            // 개선필요점2. 현재 여기서는 문자열의 각 문자를 탐색할 때마다 filter를 통해 전체 배열을 다시 순회하고 있다. 이로 인해 시간 복잡도가 O(n2)에 가까워질 수 있다.
            int count = (int) Arrays.stream(sArr).filter(str -> str.equals(s1)).count();
            if (count == 1){
                answer.append(sArr[i]);
            }
        }

        char[] arr = answer.toString().toCharArray();
        Arrays.sort(arr);
        answer = new StringBuilder(new String(arr));

        return answer.toString();
    }


    /* 개선 후 코드 */
    // HashMap 을 사용하여 등장 횟수를 먼저 계산한 후, 한번만 등장한 문자를 처리하는 방식.
    public static String solution_1(String s){
        Map<Character, Integer> countMap = new HashMap<>();

        // 문자 등장 횟수 계산
        for(char c : s.toCharArray()){
            countMap.put(c, countMap.getOrDefault(c,0) + 1);
        }

        // 한 번만 등장한 문자 필터릴 및 정렬
        List<Character> result = new ArrayList<>();
        // entrySet() : 키-값 쌍(key-value pairs) 의 집합을 Set 으로 반환.
        for(Map.Entry<Character, Integer> entry : countMap.entrySet()){
            System.out.println("entry : " + entry); // entry : e=1
            if (entry.getValue() == 1){
                result.add(entry.getKey());
            }
        }

        Collections.sort(result);

        StringBuilder answer = new StringBuilder();
        for (char c : result) {
            answer.append(c);
        }

        return answer.toString();
    }




}
