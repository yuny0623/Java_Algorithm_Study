package Leetcode;
import java.util.*; 
/**
 * 0841 ~ <다음날 0918> <답지보고 풀음>
 * Runtime: 27 ms, faster than 90.83% of Java online submissions for Rank Transform of an Array.
Memory Usage: 58.4 MB, less than 96.28% of Java online submissions for Rank Transform of an Array.

코멘트: 
처음 시도한 코드에서 Time Limit Exceed 가 발생했다. 
그래서 분명 너무 많은 동작이 있어서 그렇다고 생각했다. 
지금 보면 HashMap을 쓰고 있고 거기서 putIfAbsent 를 쓰고 있다. 
즉 key가 있으면 그 값을 반영하지 않는다. 근데 key가 없으면? val과 함께 넣어준다. 
put if absent 즉 없으면 넣어준다는 소리다. 

arr.clone() 이란? 
https://coding-factory.tistory.com/548
 */
public class leetcode_1331 {
    public int[] arrayRankTransform(int[] arr) {
        // 0841 ~ 0851 <답지보고 풀음>
        // set 으로 중복 제거 
        // sort 해서 정렬하기 increasing order 로 하기 
        // 정렬array에서의 index로 값 표현하기 
        // Time Limit exceede 발생! 
        int[] sortedArr = arr.clone(); 
        Map<Integer, Integer> rank = new HashMap<>();
        Arrays.sort(sortedArr);
        for(final int a: sortedArr){
            rank.putIfAbsent(a, rank.size() + 1);
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = rank.get(arr[i]);
        }
        return arr; 
    }
}
