package Leetcode;
import java.util.*;
/**
 * 
 * Runtime: 4 ms, faster than 15.79% of Java online submissions for Find N Unique Integers Sum up to Zero.
Memory Usage: 40.6 MB, less than 84.18% of Java online submissions for Find N Unique Integers Sum up to Zero.

코멘트: List<String>은 그냥 toArray() 를 통해 바로 array로 변환 가능하다. 
그런데 int형과 같은 primitive 타입은 toArray를 사용할 수 없다. 그래서 아래와 같은 변환 방법을
사용한거다. 
 */
public class leetcode_1304 {
    public int[] sumZero(int n) {
        // 0557 ~ 
        // 합쳐서 0이 되는 n개 요소를 갖는 array를 리턴해라. 어떤걸 리턴하더라도 상관은 없음. 
        // 생각보다 어려운것 같은데? 
        // 처음보는 유형임. 
        List<Integer> list = new ArrayList<>(); 
        for(int i = 1; i<(n/2 + 1); i++){
            list.add(-i);
            list.add(i);
        }

        if(n%2 == 0){
            int[] result = list.stream().mapToInt(i -> i).toArray(); 
            return result; 
        }else{
            list.add(0);
            int[] result = list.stream().mapToInt(i -> i).toArray();
            return result;
        }
    }
}
