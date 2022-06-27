package Leetcode;
/**
 * Runtime: 1 ms, faster than 48.66% of Java online submissions for Count Negative Numbers in a Sorted Matrix.
Memory Usage: 49.5 MB, less than 35.97% of Java online submissions for Count Negative Numbers in a Sorted Matrix.

 * 코멘트:
 * 그냥 쉬운문제임. 딱히 어려운 내용이 없음. 
 */
public class leetcode_1351 {
    public int countNegatives(int[][] grid) {
        int count = 0; 
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j< grid[0].length; j++){
                if(grid[i][j] < 0){
                    count += 1; 
                }
            }
        }
        return count; 
    }
}
