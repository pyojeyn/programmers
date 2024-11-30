package begin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

// 옷가게 할인받기
/*
* 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
* */
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution(150000));
    }

    // 나의 풀이.. 더러워..
    public static int solution(int price){
        int answer = 0;
        double result = price * 0.05;
        System.out.println("double result="+ result);
        if(price >= 100000 && price < 300000){
            price -= price * 0.05;
            System.out.println("price*0.05 : "+ price * 0.05);
            System.out.println("price="+ price);
        }else if(price >= 300000 && price < 500000){
            System.out.println("price*0.1 : "+ price * 0.1);
            price -= price * 0.1;
            System.out.println("price="+ price);
        }else if(price >= 500000){
            price -= price * 0.2;
            System.out.println("price*0.2 : "+ price * 0.2);
            System.out.println("price="+ price);
        }
        answer = price;
        return answer;
    }

    // 다른 사람의 풀이..
    public int solution_1(int price){
        int answer = 0;

        // 높은 값부터 잡히게 해야 작은 값 비교하는 if 문에 안잡힘.
        // 그리고 뺄샘 할 필요도 없이 퍼센테이지를 먼저 할인률 뺀걸 곱하면됨..
        if(price >= 500000){
            return (int) (price * 0.8);
        }

        if(price >= 300000){
            return (int) (price * 0.9);
        }

        if(price >= 100000){
            return (int) (price * 0.95);
        }
        return price;
    }
}
