package begin;

import java.util.*;
import java.util.stream.Collectors;


/*
    [잘라서 배열로 저장하기]
     문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
 */
// 2점 획득!
public class Solution1 {
    public static void main(String[] args) {
         System.out.println(Arrays.toString(solution("abc1Addfggg4556b", 6)));
         // (0,6) (6, 12) (12)
         System.out.println(Arrays.toString(solution("abcdef123", 3)));
         // (0,3) (3, 6) (6)
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(Arrays.toString(solution_1("abc1Addfggg4556b", 6)));
        System.out.println(Arrays.toString(solution_1("abcdef123", 3)));
    }


    public static String[] solution(String my_str, int n){
        int ceil = (int) Math.ceil(my_str.length() / (double) n);
        String[] answer = new String[ceil];
        String substring = "";

        // for문 초기식에서 여러 변수 선언. i, answerIndex
        for(int i=0, answerIndex=0; i<my_str.length(); i+=n, answerIndex++){
            // 개선. 삼항연산자로 깔끔하게 하자.
//            if(i+n < my_str.length()){
//                substring = my_str.substring(i, i + n);
//            }else{
//                substring = my_str.substring(i);
//            }
//            answer[answerIndex] = substring;

            answer[answerIndex] = (i + n < my_str.length()) ? my_str.substring(i, i + n) : my_str.substring(i);
        }
        return answer;
    }

    // 처음 문제를 풀때 for 문에서 i가 n의 배수만큼 늘어나면 i를 answer의 인덱스에 대입을 못하는 고민이 생겨서 결국 위의 답을 했지만,
    // 다른 사람의 풀이를 보고 깨달았다..
    // i는 그대로 순차적으로 1씩 증가시키고, substring 의 인자1은 i*n, 인자2는 i*n + n / 온리 인자 i*n 이라는것을....
    // 이런식으로 하면 굳이 for문에 answerIndex 같은 변수를 선언 안해줘도 되는데...
    public static String[] solution_1(String my_str, int n){
        int ceil = (int) Math.ceil(my_str.length() / (double) n);
        String[] answer = new String[ceil];

        for(int i=0; i< answer.length; i++){
            answer[i] = (i * n + n < my_str.length()) ? my_str.substring(i * n, i * n + n) : my_str.substring(i * n);
        }

        return answer;
    }

}
