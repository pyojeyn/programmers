package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    [치킨 쿠폰]
프로그래머스 치킨은 치킨을 시켜먹으면 한 마리당 쿠폰을 한 장 발급합니다.
쿠폰을 열 장 모으면 치킨을 한 마리 서비스로 받을 수 있고,
서비스 치킨에도 쿠폰이 발급됩니다.
시켜먹은 치킨의 수 chicken이 매개변수로 주어질 때 받을 수 있는 최대 서비스 치킨의 수를 return하도록 solution 함수를 완성해주세요.
 */

// 4점!!!



public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution(100));
        System.out.println(solution(1081));
    }


    public static int solution(int chicken){

        /* 누적 서비스 치킨의 수를 저장할 변수 초기화 */
        int serviceChicken = 0;

        /* 쿠폰은 총 시켜먹은 치킨의 수로 초기화 한다. */
        int coupon = chicken;

        /* 쿠폰이 10개 이상일 경우 계속해서 서비스 치킨을 받음 */
        while (coupon > 9){

            /* 쿠폰이 10개 이상이면, 10개당 1마리의 치킨을 받을 수 있음 */
            int newChicken = coupon / 10;

            /* 서비스 치킨을 받은 후 남은 쿠폰은 서비스 받은 치킨으로 받은 쿠폰과 기존 쿠폰의 나머지를 합친 값 */
            coupon = newChicken + (coupon % 10);

            /* 이번에 받은 서비스 치킨의 수를 누적 */
            serviceChicken += newChicken;

            System.out.println("누적 서비스 치킨: " + serviceChicken + ", 남은 쿠폰: " + coupon); // 디버깅 출력
        }



        return serviceChicken;

    }








}

