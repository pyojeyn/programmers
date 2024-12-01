package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


/*
    [외계행성의 나이]
    우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다.
    입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
    a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다.
    나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
 */
// 1점 획득 : 단번에 통과.

public class Solution1 {
    public static void main(String[] args) {
//        System.out.println(solution(23));
//        System.out.println(solution(51));
//        System.out.println(solution(100));


        System.out.println(solution_1(22));
    }

    public static String solution (int age){
        StringBuilder answer = new StringBuilder();
        String[] aps = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        Map<Integer, String> apAndNum = new HashMap<>();
        int value = 0;
        for (String ap : aps) {
            apAndNum.put(value, ap);
            value++;
        }

        String[] ageStr =(age + "").split("");
        for (String s : ageStr) {
            answer.append(apAndNum.get(Integer.parseInt(s)));
        }
        return answer.toString();
    }

    // 개선점
    public static String solution_1(int age){
        StringBuilder answer = new StringBuilder();
        // 배열의 index 가 0부터9까지의 값을 나타내므로 Map 이 꼭 필요하지 않음.
        // age 의 각 숫자가지고 index 로 접근하면됨.
        String[] aps = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
        // 나이를 문자열로 변환하고 각 문자를 aps 배열을 통해 변환.
        for(char ch : String.valueOf(age).toCharArray()){
            answer.append(aps[ch - '0']);
        }

        // int i = '숫자' - '0'; -> 숫자(찐 정수형)
        // int i = 'N(임의의숫자)' - '0'; 의 결과는 항상 정수가 된 N.
        // 0 을 int 로 바꾸면 아스키코드값인 48로 바뀐다.
        int num1 = '1' - '0'; // '1' 은 int형 49, '0'은 int형 48. -> 49-48=1 이 된다.
        int num2 = '2' - '0';
        int num3 = '3' - '0';
        int num4 = '4' - '0';
        int num5 = '5' - '0';
        int num6 = '6' - '0';
        int num7 = '7' - '0';
        int num8 = '8' - '0';
        int num9 = '9' - '0';

        int[] nums = {num1, num2, num3, num4, num5
                , num6, num7, num8, num9};
        for(int i=0; i<nums.length; i++){
            System.out.println("num"+(i+1)+": " + nums[i]);
        }
        System.out.println("0-0  " + "\n" + ('0' - '0'));

        return answer.toString();
    }


}
