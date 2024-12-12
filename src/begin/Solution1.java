package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    [로그인 성공?]
머쓱이는 프로그래머스에 로그인하려고 합니다.
머쓱이가 입력한 아이디와 패스워드가 담긴 배열 id_pw와 회원들의 정보가 담긴 2차원 배열 db가 주어질 때,
다음과 같이 로그인 성공, 실패에 따른 메시지를 return 하도록 solution 함수를 완성해주세요.
 */

// 4점!



public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"meosseugi", "1234"},
                new String[][]{{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}}));
        System.out.println(solution(new String[]{"programmer01", "15789"},
                new String[][]{{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}}));

        System.out.println(solution(new String[]{"rabbit04", "98761"},
                new String[][]{{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}}));
    }




    public static String solution(String[] id_pw, String[][] db){

        String answer = "fail";

        String id = id_pw[0];
        String pw = id_pw[1];
        for (String[] member : db) {
            if(member[0].equals(id)){
                /* 제한사항에 회원들의 아이디는 같을 수 없기 때문에 같이 for문에서 조건문으로 명시 가능.
                 한번 이 if 문 들어오면 두번다시 이 안에 들어올일 없음.
                 이 if문에 한번 들어오면 끝인거임. 무조건 둘중에 하나임. */

                /* 문제의 제한사항에 따르면 회원들의 아이디는 중복될 수 없기 때문에,
                   for 루프 내에서 아이디가 일치하는 경우에는 그 아이디를 가진 회원이 단 하나만 존재. */
                if (member[1].equals(pw)) answer = "login";
                else answer = "wrong pw";
            }
        }
        return answer;
    }
}

