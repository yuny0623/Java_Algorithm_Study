package Leetcode;
/**
 * 0829 ~ 0838 
 * Runtime: 1 ms, faster than 87.55% of Java online submissions for Maximum 69 Number.
Memory Usage: 41 MB, less than 50.20% of Java online submissions for Maximum 69 Number.

코멘트: 
문제를 잘못 읽었다. 6과 9중 하나를 9나 6으로 바꿀 수 있는데 그렇게 바꾼 수중 
가장 큰 수를 리턴하라는거다. 나는 swap 으로 진행했는데 나중에 알고보니 잘못 푼거였다. 
string 에서 특정 index 를 특정 char 로 바꾸고 싶으면 StringBuilder 를 사용해서 바꾸면 된다ㅣ. 
setCharAt을 사용해서 바꾸면 된다./ 
 */
public class leetcode_1323 {
    public int maximum69Number (int num) {
        // 0829 ~ 0838 
        // 왼쪽부터 가장 처음 만나는 6의 index를 찾고 
        // 오른쪽부터 가장 처음 만나는 9의 index를 찾는다.
        // 이후에 둘이 swap 하면 끝. 
        String num_s = String.valueOf(num);
        int six_index = 0; 
        for(int i = 0; i<num_s.length(); i++){
            if(num_s.charAt(i) == '6'){
                six_index = i; 
                break; 
            }
        }

        StringBuilder sb = new StringBuilder(num_s);
        sb.setCharAt(six_index, '9');
        return Integer.parseInt(sb.toString());
    }
}
