package Leetcode;
import java.util.*; 
/** 
 *  ~ 0537
 * 
 * Runtime: 141 ms, faster than 5.06% of Java online submissions for Check If N and Its Double Exist.
Memory Usage: 53.8 MB, less than 6.10% of Java online submissions for Check If N and Its Double Exist.
   코멘트: 
 * 문제 자체는 쉬운데 범위를 잘못 잡아서 괜히 시간을 낭비했음. 
 * 
 */

public class leetcode_1346 {
    public boolean checkIfExist(int[] arr) {
        int[] arr2 = arr.clone();
        Arrays.sort(arr2);
        for(int val: arr2){
            System.out.printf("%d ", val);
        }
        for(int i = 0; i<arr2.length - 1; i++){
            for(int j = i + 1; j<arr2.length; j++){
                if(arr2[i]*2 == arr2[j] || arr2[j]*2 == arr2[i]){
                    System.out.printf("is true: %d *2= %d", arr2[i], arr2[j]);
                    return true;
                }
            }
        }
        return false; 
    }
}
