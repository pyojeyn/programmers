package begin;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    [OX 퀴즈]
    덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
    수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 */

// 1점.
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[]{"3 + -4 = -3", "5 + 6 = 11"})));
        System.out.println(Arrays.toString(solution(new String[]{"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})));
    }


    public static String[] solution(String[] quiz){
        String[] answer = new String[quiz.length];
        int size = quiz.length;

        for (int i=0; i<size; i++) {
            Pattern pattern = Pattern.compile(" [+-] ");
            Matcher matcher = pattern.matcher(quiz[i]);
            String operator = "";
            while (matcher.find()){
                operator = matcher.group().replaceAll(" ", "");
            }
            String[] sArr = quiz[i].split(" [^0-9] ");
            System.out.println("sArr = " + Arrays.toString(sArr));

            int firstNum = Integer.parseInt(sArr[0]);
            int secondNum = Integer.parseInt(sArr[1]);
            int resultNum = Integer.parseInt(sArr[2]);
            int result = operator.equals("+") ? firstNum + secondNum : firstNum - secondNum;

            answer[i] = result == resultNum ? "O" : "X";
        }
        return answer;
    }

    public static String[] solution_1(String[] quiz){
        String[] answer = new String[quiz.length];

        for(int i=0; i<quiz.length; i++){
            String[] parts = quiz[i].split(" ");

            // 3 + 5 = 8 => 0번째 3, 1번째 +, 2번째 5, 3번째 = , 4번째 = 8
            int X = Integer.parseInt(parts[0]);
            String operator = parts[1];
            int Y = Integer.parseInt(parts[2]);
            int Z = Integer.parseInt(parts[4]);

            int resultNum = operator.equals("+") ? X + Y : X - Y;

            answer[i] = Z == resultNum ? "O" : "X";
        }

        return answer;
    }




}

