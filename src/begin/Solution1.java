package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    [영어가 싫어요]
     영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
     문자열 numbers가 매개변수로 주어질 때, numbers를 정수로 바꿔 return 하도록 solution 함수를 완성해 주세요.
 */


// 4점.
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution("onetwothreefourfivesixseveneightnine"));
        System.out.println(solution("onefourzerosixseven"));
    }


    public static long solution(String numbers){
        Map<String, String> numbersMap = Map.of(
                "zero","0",
                "one", "1",
                "two", "2",
                "three", "3",
                "four", "4",
                "five", "5",
                "six", "6",
                "seven", "7",
                "eight", "8",
                "nine","9");


        String numStr = "";
        List<String> numList = new ArrayList<>();
        for (int i=0; i<numbers.length(); i++){
            numStr += numbers.charAt(i);
            if(numbersMap.get(numStr) != null){
                numList.add(numbersMap.get(numStr));
                numStr = "";
            }
        }


        String answer = String.join("", numList);
        return Long.parseLong(answer); // 숫자가 너무 커서 Integer 로 하면 에러나는거였음...
    }


    // 그냥 replaceAll 하면 되는거였음을....
    public static long solution_1(String numbers){
        String[] numbers_arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        // 인덱스 값 순서대로 zero ~ nine 까지
        // numbers_arr[0] -> zero -> 인덱스값이랑 의미가 동일 저 값을 찾으면 인덱스 값을 String 으로 변환해서 replace 해줌.
        for (int i = 0; i < numbers_arr.length; i++) {
            numbers = numbers.replaceAll(numbers_arr[i], String.valueOf(i));
        }

        long answer = Long.parseLong(numbers);
        return answer;
    }


}

