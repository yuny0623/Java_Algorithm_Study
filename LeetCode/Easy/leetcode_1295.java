package Leetcode;
/**
 * Runtime: 2 ms, faster than 60.36% of Java online submissions for Find Numbers with Even Number of Digits.
Memory Usage: 44.4 MB, less than 11.02% of Java online submissions for Find Numbers with Even Number of Digits.

 *코멘트: 
 딱히 어렵지는 않은 문제. 근데 내가 지문을 세번이나 잘못 읽어서 굳이 시간을 낭비함  
 */
public class leetcode_1295 {
    public int findNumbers(int[] nums) {
        // 0521 ~ 0539 
        int counter = 0; 
        for(int i = 0; i<nums.length; i++){
            String number = String.valueOf(nums[i]); 
            if(number.length()%2==0){
                counter+=1;
            }
        }
        return counter; 
    }
}
