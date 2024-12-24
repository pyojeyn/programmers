package begin;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/*
    [최빈값 구하기]
    최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
    정수 배열 array가 매개변수로 주어질 때,
    최빈값을 return 하도록 solution 함수를 완성해보세요.
    최빈값이 여러 개면 -1을 return 합니다.
 */

// 2점
// ** 객체 숫자 비교할때는 기본형으로 바꾸어서 비교하기
// 상수 풀(Constant Pool) Integer -128 ~ 127

public class Solution1 {
    public static void main(String[] args) {

        System.out.println(solution_1(new int[]{1, 2, 3, 3, 3, 4}));
        System.out.println(solution_1(new int[]{1, 1, 2, 2}));
        System.out.println(solution_1(new int[]{1}));
        System.out.println(solution_1(new int[]{0, 0, 1, 1}));
        System.out.println(solution_1(new int[]{1, 1, 2, 3, 3, 4}));
        System.out.println(solution_1(new int[]{200, 200, 300, 300, 1}));

        Integer aa = 200;
        Integer bb = 200;
        int cc = 200;
        System.out.println("-----------");

        // 참조값끼리 비교하게 되어 항상 false 가 나옴.
        System.out.println(aa == bb); // false



        /* Integer 랑 int 랑 비교하면 int 기준으로 비교된다.
         Integer 객체와 기본형 int 를 비쇼할 때 자동으로 언박싱됨.
         -> Integer 객체가 기본형 int 로 변환되어 비교가 이루어짐. */
        System.out.println(aa == cc); // true
        System.out.println(bb == cc); // true
    }


    public static int solution(int[] array){
        List<Integer> nList = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());

        Set<Integer> nSet = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toSet());

        Map<Integer, Integer> nMap = new HashMap<>();

        List<Integer> countList = new ArrayList<>();
        for (Integer integer : nSet) {
            int count = (int) nList.stream().mapToInt(x -> x).filter(x -> x == integer).count();
            nMap.put(integer, count);
            countList.add(count);
        }
        int max =  countList.stream().mapToInt(x -> x).max().getAsInt();

        long count = nMap.entrySet().stream()
                .filter(n -> n.getValue() == max).count();
        if(count > 1){
            return -1;
        }

        int maxN = nMap.entrySet().stream()
                .filter(n -> n.getValue() == max).map(Map.Entry::getKey)
                .findFirst().orElse(-1);

        return maxN;
    }


    public static int solution_1(int[] array){
        int answer = 0;
        if(array.length == 1) return array[0];

        Set<Integer> nSet = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toSet());

        List<Integer> nList = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());

        int maxCount = 0;
        boolean isDuplicateMax = false;
        for(Integer num : nSet){
            int count = (int) nList.stream().filter(x -> Objects.equals(x, num)).count();

            /* ===> DO NOT! filter(x -> x == num)
             == 연산자는 기본형 데이터 타입과 객체 참조를 비교할 때 사용되기때문.
             기본형 타입에서는 값 자체를 비교하지만, 객체에서는 참조(즉, 메모리 주소) 를 비교하기때문.
             그래서 Integer 와 같은 객체에서는 값 비교가 아니라 객체의 **참조값을 비교한다.
             Integer 는 객체이기 때문에 == 연산자로 비교하면 두 객체가 같은 메모리 주소를 가리키는지 비교하는 것이라
             값이 같더라도 다른 객체일 수 있기 때문에 올바른 비교가 이루어지지 않을 수 있다.
             일반 예제로 했을때 통과 했던 이유는
             예제에서 사용했던 숫자들은 상수풀에 저장된 숫자들이라 동일한 값들을 재사용하기 때문에
             같은 메모리 주소를 가리키기 때문에 참조값 비교가 잘 동작했던 것이다.
             상수풀 -> ** 자바에서는 Integer 값이 -128 ~ 127 사이일 때 자주 사용하는 숫자들을(Constant Pool) 에 저장하여 동일한 값을 재사용한다.
             이 값들에 대해 == 연산자는 같은 메모리 주소를 가리키기 때문에 참조 값 비교가 잘 동작한다. */
            int countWrong = (int) nList.stream().filter(x -> x == num).count();
            System.out.println("countWrong= " + countWrong);
            // ===

            if(count > maxCount){
                maxCount = count;
                answer = num;
                isDuplicateMax = false;
            }else if(count == maxCount){
                isDuplicateMax = true;

/*                return -1;
 아직 최종 maxCount 가 정해지지 않은 상태에서 return 하면 안됨.
 ex: {1, 2, 3, 3, 3, 4} -> 최빈값은 3 인데 1과2의 횟수가 똑같을때 바로 return 됨. */
            }
        }
        if(isDuplicateMax) {
            return -1;
        }


        return answer;
    }

}

