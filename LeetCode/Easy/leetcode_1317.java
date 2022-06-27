package Leetcode;

/**
 * Runtime: 1 ms, faster than 84.44% of Java online submissions for Convert Integer to the Sum of Two No-Zero Integers.
Memory Usage: 40.5 MB, less than 79.11% of Java online submissions for Convert Integer to the Sum of Two No-Zero Integers.
코멘트: 
쉬운 문제다.String 에서 쓸 수 있는 contains 를 사용했다. 
 */
public class leetcode_1317 {
        public int[] getNoZeroIntegers(int n) {
        int[] result = new int[2];
        for(int i = 1; i< n; i++){
            int num_a = i;
            int num_b = n - num_a; 
            String a = String.valueOf(num_a);
            String b = String.valueOf(num_b); 
            if((!a.contains("0")) && (!b.contains("0"))){
                result[0] = num_a;
                result[1] = num_b;
                break; 
            }
        }
        return result; 
    }
}
