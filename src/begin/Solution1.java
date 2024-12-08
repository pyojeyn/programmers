package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    [공 던지기]
     머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다.
     공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
     친구들의 번호가 들어있는 정수 배열 numbers와 정수 K가 주어질 때,
     k번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록 solution 함수를 완성해보세요.
     numbers의 길이는 3부터 99까지.
     k의 길이는 1부터 999까지.
 */
// 5점 획득! 어려웠지만.. 어찌저찌 풀어서 5점 받았다.
public class Solution1 {
    public static void main(String[] args) {
        // [1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6]
        // [1,2,3,1,2,3]
        System.out.println(solution_1(new int[]{1,2,3,4}, 2));
        System.out.println(solution_1(new int[]{1, 2, 3, 4, 5, 6}, 5));
        System.out.println(solution_1(new int[]{1, 2, 3}, 3));
    }


    public static int solution(int[] numbers, int k){
        int answer = 0;
        int sd = numbers.length / 2;
        int[] numbersPlus = {};

        // 진짜 비효율적임 굳이 배열을 확장할 필요가 없었다..
        // 괜찮어 배열 인덱스 순환할줄 몰라서 그런거니까...!!!
        if(sd <= k){
            numbersPlus = IntStream.range(0, k)
                    .flatMap(i -> IntStream.of(numbers)) // 배열을 times 번 반복
                    .toArray();// 최종 결과 배열로 변환
        }

        int cnt = 1;
        for (int i=0; i<numbersPlus.length; i+=2){
            if(cnt == k){
                answer = numbersPlus[i];
                break;
            }
            cnt++;
        }

        return answer;
    }

    public static int solution_1(int[] numbers, int k){
        // 2 % 4 = 2번 인덱스
        // 8 % 6 = 2번 인덱스
        // 4 % 3 = 1번 인덱스

        int index = (2 * (k - 1)) % numbers.length;
        /* k - 1: 공을 첫 번째로 던지는 사람은 이미 선택(맨첫번째)되었기 때문에, k-1번의 이동이 필요하다.
           2 * (k - 1) : 한 번에 두 칸씩 건너뛰므로. 총 이동거리는 저렇게 된다.
           % numbers.length : 나머지값이 인덱스가 됨. 나머지 연산으로 배열의 인덱스를 순환시킬 수 있음. */
        return numbers[index];
    }


}
