import java.util.Arrays;

/**
 * 1000 ~ 1019
 * 어려울줄 알았는데 생각보다 쉬운 문제네요.
 */
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        int j = 0;
        int i = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        if(g.length == 0 || s.length == 0){
            return 0;
        }

        while(i < g.length && j < s.length){
            if(j < s.length && g[i] <= s[j]){
                count += 1;
                j += 1;
                i += 1;
            }else{
                j += 1;
            }
        }
        return count;
    }
}