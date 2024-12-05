package begin;

import java.util.*;


/*
    [7의 개수]
    머쓱이는 행운의 숫자 7을 가장 좋아합니다.
    정수 배열 array가 매개변수로 주어질 때,
    7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
 */

// 1점 획득

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{7,77,17}));
        System.out.println(solution(new int[]{10,29}));
    }



    public static int solution(int[] array){
        int answer = 0;
        String strFromArray = "";

        for (int i : array) {
            strFromArray += String.valueOf(i);
        }

        for(char c : strFromArray.toCharArray()){
            if(7 == (c - '0')){
                answer++;
            }
        }
        return answer;
    }

}
