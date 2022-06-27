package Leetcode;

import java.util.Arrays;
/**
 *Runtime: 9 ms, faster than 24.30% of Java online submissions for Element Appearing More Than 25% In Sorted Array.
Memory Usage: 52.1 MB, less than 5.75% of Java online submissions for Element Appearing More Than 25% In Sorted Array.

코멘트: 
쉬운 문제. Arrays.stream 에 좋은 기능들이 많이 있네. max 를 뽑을 수 도 있다. 
참고로 max 는 OptionalInt 를 리턴하기 때문에 이걸 getAsInt를 통해 벗겨내야 쓰기 편하다. 허허 
 */
public class leetcode_1287 {
    public int findSpecialInteger(int[] arr) {
        // 0454 ~ 0506 
        int maxVal = Arrays.stream(arr).max().getAsInt(); 
        int[] check = new int[maxVal + 1];
        for(int i = 0; i< arr.length; i++){
            check[arr[i]] += 1; 
        }
        
        int number = 0; 
        System.out.println(arr.length/4); 
        for(int i = 0; i< check.length; i++){
            if(check[i] > arr.length/4){
                number = i ;
                break; 
            }
        }
        return number; 
    }
}
