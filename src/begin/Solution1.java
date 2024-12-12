package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    [직사각형 넓이 구하기]
2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]
가 담겨있는 배열 dots가 매개변수로 주어질 때,
직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
 */

// 직사각형 5점 !


public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1,1}, {2,1}, {2,2}, {1,2}}));
        System.out.println(solution(new int[][]{{-1,-1}, {1,1}, {1,-1}, {-1,1}}));
    }




    public static int solution(int[][] dots){
        /* 가로 길이 : x좌표의 최대값 - 최소값을 구하고 뺌
           세로 길이 : y좌표의 최대값 - 최소값을 구하고 뺌 */

        int maxX = dots[0][0]; // 1
        int minX = dots[0][0]; // 1
        int maxY = dots[0][1]; // 1
        int minY = dots[0][1]; // 1
        for(int i=1; i< dots.length; i++){
            for (int j=0; j<dots[i].length; j++){
               int current = dots[i][j];
                System.out.println("current = " + current);
               if (j == 0){
                   maxX = Math.max(maxX, current);
                   minX = Math.min(minX, current);
               }else{
                   maxY = Math.max(maxY, current);
                   minY = Math.min(minY, current);
               }
            }
        }


        return (maxX - minX) * (maxY - minY);
    }
}

