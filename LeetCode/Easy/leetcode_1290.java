package Leetcode;
import java.util.*;

public class leetcode_1290 {
    // 0511 ~ 0519
    public int getDecimalValue(ListNode head) {
        List<Integer> li = new ArrayList<>(); 
        while(head != null){
            li.add(head.val);
            head = head.next; 
        }
        String binaryString = ""; 
        for(int i = 0; i<li.size(); i++){
            binaryString += String.valueOf(li.get(i)); 
        }
        return Integer.parseInt(binaryString, 2); 
    }
}
