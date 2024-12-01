package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


/*
    369게임
    머쓱이는 친구들과 369게임을 하고 있습니다. 369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다.
    머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.

 */
public class Solution1 {
    public static void main(String[] args) {

        System.out.println(solution(336699));
        System.out.println(wrongSolution(30));
        System.out.println(fixedSolution(30));
    }

    public static int solution(int order){
        // 결국 이 두번째 코드로 정답을 맞췄는데..!

        int answer = 0;


        // 개선점1. 굳이 메소드 쓸 필요 없음 연산으로 빈문자열을 더해주면 문자열로 변환.
//        String orderStr = String.valueOf(order);
        String orderStr = order + "";
        String[] orderStrArr = orderStr.split("");

        for (String s : orderStrArr) {
            if(Integer.parseInt(s) == 3 ||
            Integer.parseInt(s) == 6 ||
            Integer.parseInt(s) == 9){
                answer++;
            }
        }



        return answer;
    }

    public static int wrongSolution(int order){
//         처음에 짠 코드인데 틀렸다.
//         틀린 이유: 숫자 0도 필터 조건 0에 포함이된다
//         30 이 매개변수로 주어지면 기대 값은 1인데 2가 나오기때문에 틀림.
//         숫자가 3,6,9 인지 명확히 확인하는 조건을 추가해야 함.
        String[] orderStrArr = String.valueOf(order).split("");
        return (int)Arrays.stream(orderStrArr).mapToInt(Integer::parseInt)
                .filter(z -> z % 3 == 0).count();
    }

    public static int fixedSolution(int order){
        String[] orderStrArr = String.valueOf(order).split("");
        return (int) Arrays.stream(orderStrArr)
                .mapToInt(Integer::parseInt)
                .filter(n -> n == 3 || n == 6 || n == 9)
                .count(); // 3,6,9 만 필터링.
    }
}
