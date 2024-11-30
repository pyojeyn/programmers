package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/*
[가장 큰 수 찾기]
* 정수 배열 array가 매개변수로 주어질 때,
* 가장 큰 수와 그 수의 인덱스를 담은 배열을 return 하도록 solution 함수를 완성해보세요.
* */
public class Solution1 {
    public static void main(String[] args) {
        int[] array = {9, 10, 11, 8};

        System.out.println(Arrays.toString(solution_1(array)));
        System.out.println(Arrays.toString(solution_2(array)));

    }

    public static int[] solution(int[] array){
        int[] answer = new int[2];

        // 배열 먼저 정렬
        // 배열은 참조형이라서 대입 ㄴㄴ
        // 값 하나하나 세팅 후 새로운 주소만들어야됨.
        int[] tmpArray = new int[array.length];
        for(int i = 0; i<tmpArray.length; i++){
            tmpArray[i] = array[i];
        }
        // 정렬후 가장 큰값 변수에 대입
        Arrays.sort(tmpArray);
        int biggestNum = tmpArray[tmpArray.length - 1];

        // 매개변수 array 돌면서 가장 큰값대입되어있는 변수랑 비교.
        for(int i=0; i<array.length; i++){
            if(biggestNum == array[i]){
                answer[0] = biggestNum;
                answer[1] = i;
            }
        }


        return answer;
    }

    // 개선할 점.
    // 1. 배열 복사가 불필요.
    // 2. O(n) 의 시간 복잡도로 해결 가능.
    //    - 현재 코드는 배열 정렬에 O(n log n) 이 소요됨. 이 문제는 한 번 순회만으로 해결 가능.
    public static int[] solution_2(int[] array){
        // 가장 큰수와 인덱스 초기화.
        int biggestNumber = array[0];
        int index = 0;

        // 위에 0 의 것들이 초기화 됬으니까 1부터 시작.
        for(int i=1; i<array.length; i++){
            if (array[i] > biggestNumber){
                biggestNumber = array[i];
                index = i;
            }
        }
        return new int[]{biggestNumber, index};
    }





    // 다른 사람 답.
    public static int[] solution_1(int[] array) {

        // 처음 인덱스의 값으로 초기화
        int[] answer = {array[0],0};

        // i 를 1부터 시작, answer와 array를 비교.
        for(int i = 1; i < array.length; i++){
            if(answer[0] < array[i]){
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        return answer;
    }
}

