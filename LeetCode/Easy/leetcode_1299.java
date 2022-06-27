package Leetcode;
/**
 * Runtime: 239 ms, faster than 17.68% of Java online submissions for Replace Elements with Greatest Element on Right Side.
Memory Usage: 44.3 MB, less than 93.04% of Java online submissions for Replace Elements with Greatest Element on Right Side.

 *코멘트: 
 쉬운 문제임. 그냥 문제 그대로 구현하면 됨.  
 */
public class leetcode_1299 {
    public int[] replaceElements(int[] arr) {
        // 0546 ~ 
        int[] result = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            int max_val = 0; 
            if(i == arr.length-1){
                result[i] = -1;
                break; 
            }
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] >= max_val){
                    max_val = arr[j]; 
                }
            }
            result[i] = max_val; 
        }
        return result; 
    }
}
