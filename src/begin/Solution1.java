package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

// 가위 바위 보.
/*
 * 가위는 2 바위는 0 보는 5로 표현합니다.
 * 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
 * rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록
 * solution 함수를 완성해보세요.
 * */
public class Solution1 {


    // 나의 답....
    public static String solution(String rsp){
        String win2 = "0";
        String win0 = "5";
        String win5 = "2";

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<rsp.length(); i++){
            String compareStr = String.valueOf(rsp.charAt(i));

            if(compareStr.equals("2")){
                sb.append(win2);
            }

            if(compareStr.equals("0")){
                sb.append(win0);
            }

            if(compareStr.equals("5")){
                sb.append(win5);
            }
        }
        return sb.toString();
    }


    // 다른 사람이 푼 답.
    // Map 을 사용할 수 있다.
    public static String solution_1(String rsp){
        Map<String, String> winNumbers = new HashMap<>();
        winNumbers.put("2", "0");
        winNumbers.put("0", "5");
        winNumbers.put("5", "2");

        StringBuilder stringBuilder = new StringBuilder();

        for(int i =0; i <rsp.length(); i++){
            stringBuilder.append(winNumbers.get(rsp.substring(i, i + 1)));
        }


        return stringBuilder.toString();
    }
}
