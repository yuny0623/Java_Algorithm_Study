package Leetcode;

/**
Runtime: 1 ms, faster than 22.67% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.
Memory Usage: 41.4 MB, less than 19.09% of Java online submissions for Subtract the Product and Sum of Digits of an Integer.

코멘트: 
쉬운 문제임. 마지막 return에서 Math.abs 쓰는게 아님. 
절대차이를 구하는게 아님. 
참고로 Integer.parseInt는 char을 int로 변환하는게 아니라String 을 int 로 반환하는거임.
숫자 한개 -> char을 int 로변환하려면 Character.getNumericValue() 을 써야함. 

*/
public class leetcode_1281{
    public int subtractProductAndSum(int n) {
        String s = String.valueOf(n);
        int product = 1; 
        int sum = 0; 
        for(int i = 0; i < s.length(); i++){
            product *= Character.getNumericValue(s.charAt(i));
            sum += Character.getNumericValue(s.charAt(i));
        }
        
        return product - sum; 
    }
}