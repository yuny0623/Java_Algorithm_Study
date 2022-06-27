package Leetcode;

import java.util.*;
import java.util.stream.*; 

/**
 * 0720 ~ 0753 
 * untime: 19 ms, faster than 5.34% of Java online submissions for Decrypt String from Alphabet to Integer Mapping.
Memory Usage: 43.2 MB, less than 14.86% of Java online submissions for Decrypt String from Alphabet to Integer Mapping.

코멘트: Collections.reverse 를 통해서 arraylist 를 거꾸로 뒤집을 수 있다. 이게 좀 좋은 기능이네. 
그리고 java8의 기능을 활용해서 stream 을 활용할 수 있는데 이것도 좋은 기능이 많다. 
 */
public class leetcode_1309 {
    public String freqAlphabets(String s) {
        // 0720 ~ 0753 
        // a ~ i --> 1 ~ 9
        // j ~ z --> 10# ~ 26#
        // 이거 # 때문에 뒤에서부터 접근해야할듯 ... 
        List<Character> list = new ArrayList<>(); 
        int i = s.length() - 1; 
        while(i > -1){
            if(s.charAt(i) == '#'){
                String str = "";
                str += s.charAt(i - 2);
                str += s.charAt(i - 1);
                
                char c = (char)(96 + Integer.parseInt(str)); 
                list.add(c); 
                i -= 3; 
                continue; 
            }else{
                String str = "";
                str += s.charAt(i); 
                char c = (char)(96 + Integer.parseInt(str));
                list.add(c);
                i -= 1;
                continue; 
            }
        }
        
        Collections.reverse(list);
        String result =  list.stream().map(String::valueOf).collect(Collectors.joining()); 
        return result;
    }
}
