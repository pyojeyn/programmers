package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

// 직각삼각형 출력.
/*
"*"의 높이와 너비를 1이라고 했을 때, "*"을 이용해 직각 이등변 삼각형을 그리려고합니다.
정수 n 이 주어지면 높이와 너비가 n 인 직각 이등변 삼각형을 출력하도록 코드를 작성해보세요.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        int n = 3;

        for (int i = 1; i <= n; i++) { // i는 현재 줄 번호
            for (int j = 1; j <= i; j++) { // j는 해당 줄에서 출력할 '*'의 개수
                System.out.print("*");
            }
            System.out.println(); // 줄 바꿈
        }
    }
}
