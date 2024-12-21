package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    [등수 매기기]
영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다.
영어 점수와 수학 점수를 담은 2차원 정수 배열 score 가 주어질 때,
영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return 하도록 solution 함수를 완성해주세요.
 */

// 8점.



public class Solution1 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(solution(new int[][]{{100, 0}, {0, 100}, {50, 50}})));
        System.out.println(Arrays.toString(solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}})));
        System.out.println(Arrays.toString(solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100,100}, {10,30}})));



        /*
           ***내가 계속 틀렸던 이유***
           코드에 문제가 있나 싶었지만. 타입 문제였다.
           [90, 91] 의 평균은 90.5 이다. 그럼 [90, 90] 의 평균인 90 점보다 등수가 높아야 하는게 맞다.
           그러므로 타입을 Double 로 선언해야 한다.
           하지만 타입을 Integer 로 선언하면 둘의 평균이 90점이 되어 등수가 동일하게 된다.
        */
        System.out.println(Arrays.toString(solution_wrong(new int[][]{{90,91}, {90,90}, {30,90}}))); // -> [1, 1, 3]
        System.out.println(Arrays.toString(solution(new int[][]{{90,91}, {90,90}, {30,90}}))); // -> [1, 2, 3] 이게 마따..


        System.out.println("---Double & Int---");
        double value = 90.9;
        int truncatedValue = (int) value;
        System.out.println("value = " + value);
        System.out.println("truncatedValue = " + truncatedValue);

    }






    public static int[] solution(int[][] score){
        System.out.println("Hello! Here is the correct solution code!!");

        // 내림차순으로 정렬할 배열
        Double[] answer = new Double[score.length];

        // 그대로 순서를 보존할 배열
        Double[] finalAnswer = new Double[score.length];

        // 내림차순할 배열, 순서보존 배열 각각 평균값을 계산해주어 넣는다
        for (int i=0; i< score.length; i++){
            double avg = (score[i][0] + score[i][1]) / 2.0;
            answer[i] = avg;
            finalAnswer[i] = avg;
        }

        // 내림차순으로 배열 정렬
        Arrays.sort(answer, Collections.reverseOrder());

        // 평균점수와 등수를 저장할 Map 생성
        Map<Double, Integer> rankMap = new HashMap<>();

        // **rank 는 1부터 시작해서 1씩 증가하기 때문에 배열을 내림차순으로 정렬해야 한다.
        int rank = 1;
        for(int i=0; i<answer.length; i++){
            if(!rankMap.containsKey(answer[i])){
                rankMap.put(answer[i],  rank++);
            }else{
                rankMap.put(answer[i], rankMap.get(answer[i]));
                rank++;
            }
        }

        System.out.println(rankMap);

        int[] ranks = new int[answer.length];
        for(int i=0; i<finalAnswer.length; i++){
            ranks[i] = rankMap.get(finalAnswer[i]);
        }


        return ranks;
    }




    // 타입 원인으로 틀린 정답.
    public static int[] solution_wrong(int[][] score) {
        System.out.println("Hello! Here is the wrong solution code!!");
        Integer[] answer = new Integer[score.length];
        Integer[] finalAnswer = new Integer[score.length];

        for (int i=0; i< score.length; i++){
            int avg = (score[i][0] + score[i][1]) / 2;
            answer[i] = avg;
            finalAnswer[i] = avg;
        }

        Arrays.sort(answer, Collections.reverseOrder());

        Map<Integer, Integer> rankMap = new HashMap<>();

        int rank = 1;
        for(int i=0; i<answer.length; i++){
            if(!rankMap.containsKey(answer[i])){
                rankMap.put(answer[i], rank++);
            }else{
                rankMap.put(answer[i], rankMap.get(answer[i]));
                rank++;
            }
        }

        System.out.println(rankMap);

        int[] ranks = new int[answer.length];
        for(int i=0; i<finalAnswer.length; i++){
            ranks[i] = rankMap.get(finalAnswer[i]);
        }


        return ranks;
    }



}

