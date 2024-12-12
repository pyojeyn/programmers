package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    [캐릭터의 좌표]
머쓱이는 RPG게임을 하고 있습니다.
게임에는 up, down, left, right 방향키가 있으며
각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동합니다.
예를 들어 [0,0]에서 up을 누른다면 캐릭터의 좌표는 [0, 1], down을 누른다면 [0, -1],
left를 누른다면 [-1, 0], right를 누른다면 [1, 0]입니다.
머쓱이가 입력한 방향키의 배열 keyinput와 맵의 크기 board이 매개변수로 주어집니다.
캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를 return하도록 solution 함수를 완성해주세요.
 */


public class Solution1 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(solution(new String[]{"left", "right", "up", "right", "right"}, new int[]{11, 11})));
//        System.out.println(Arrays.toString(solution(new String[]{"down", "down", "down", "down", "down"}, new int[]{7, 9})));


    }



    // 비슷했는데... 아깝다.
    /*
    * 핵심 1 : 배열 원소의 값 바로 변경하지 말고 임시 변수 사용.
    * 핵심 2 : 경계 조건을 확인한 후, 유효한 경우에만 배열 원소를 업데이트 한다.
    * */
    public static int[] solution(String[] keyinput, int[] board){
        int[] answer = {0,0};
        int maxHeight = board[1] / 2;
        int maxWidth = board[0] / 2;
        // -- 여기까진 맞음...

        for(int i=0; i< keyinput.length; i++){

            /* 캐치 못했던 점1.
             answer 배열의 값을 바로 변경하는 대신, 새로운 int 변수를 사용하여 임시로 좌표 계산. */
            int newX = answer[0]; // 가로 좌표
            int newY = answer[1]; // 세로 좌표

            switch (keyinput[i]){
                case "left":
                    newX -= 1;
                    break;
                case "right":
                    newX += 1;
                    break;
                case "up":
                    newY += 1;
                    break;
                case "down":
                    newY -= 1;
            }


            /* 캐치 못했던 점2.
             for문 안에서 최종 값 처리! 유효한 입력일 경우에만 answer배열의 값을 업데이트.
             무효한 입력은 아예 반영되지 않음. */
            if (newX >= -maxWidth && newX <= maxWidth) {
                answer[0] = newX;
            }
            if (newY >= -maxHeight && newY <= maxHeight) {
                answer[1] = newY;
            }
        }


        return answer;
    }
}

