package Leetcode;
import java.util.*;
/**
 * Runtime: 12 ms, faster than 8.48% of Java online submissions for Decompress Run-Length Encoded List.
Memory Usage: 49.2 MB, less than 12.51% of Java online submissions for Decompress Run-Length Encoded List.

코멘트: 재밌는 문제다. 
딱히 어렵진 않아요. 
 */
public class leetcode_1313 {
    public int[] decompressRLElist(int[] nums) {
        // 0815 ~ 0820 
        // nums 의 길이는 항상 짝수이다. 
        List<Integer> list = new ArrayList<>(); 
        for(int i = 0; i <nums.length; i +=2){
            int freq = nums[i];
            int val = nums[i + 1];
            for(int j = 0; j<freq; j++){
                list.add(val);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
        
    }
}
