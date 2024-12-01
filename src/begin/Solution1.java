package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;


/*
    [모스부호 (1)]
    머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
    그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
    문자열 letter가 매개변수로 주어질 때,
    letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
    - 모스부호는 다음과 같습니다.
    morse = {
    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
    '-.--':'y','--..':'z'
}
 */
// 1점 획득.
public class Solution1 {
    public static void main(String[] args) {
        System.out.println(solution(".... . .-.. .-.. ---"));
    }

    public static String solution (String letter){
        Map<String, Character> morse = new HashMap<>();
        morse.put(".-", 'a');
        morse.put("-...", 'b');
        morse.put("-.-.", 'c');
        morse.put("-..", 'd');
        morse.put(".", 'e');
        morse.put("..-.", 'f');
        morse.put("--.", 'g');
        morse.put("....", 'h');
        morse.put("..", 'i');
        morse.put(".---", 'j');
        morse.put("-.-", 'k');
        morse.put(".-..", 'l');
        morse.put("--", 'm');
        morse.put("-.", 'n');
        morse.put("---", 'o');
        morse.put(".--.", 'p');
        morse.put("--.-", 'q');
        morse.put(".-.", 'r');
        morse.put("...", 's');
        morse.put("-", 't');
        morse.put("..-", 'u');
        morse.put("...-", 'v');
        morse.put(".--", 'w');
        morse.put("-..-", 'x');
        morse.put("-.--", 'y');
        morse.put("--..", 'z');

        StringBuilder answer = new StringBuilder();
        String[] letterArr = letter.split(" ");
        for (String s : letterArr) {
            answer.append(morse.get(s));
        }

        return answer.toString();
    }



}
