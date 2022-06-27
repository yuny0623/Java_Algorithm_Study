package Leetcode;
/**
 * 
 * 그냥 평범한 문제임. 어려운 내용 없음. 
 */
public class leetcode_1342 {
    public int numberOfSteps(int num) {
        // 0515 ~ 051 
        // 짝수면 2로 나누세요
        // 홀수면 1 뺴세요. 
        // 이걸 0으로 만들기까지의 step 의 개수는? 
        int step = 0; 
        while(num > 0){
            if(num%2 == 0){
                num /= 2;
            }else{
                num -= 1; 
            }
            step += 1;
        }
        return step; 
    }
}
