package LeetCode.Easy;

import java.util.Arrays;

class Solution {
    /**
     * 아래 오답 솔루션임 ㅠ
     * @param points
     * @return
     */
    public int minTimeToVisitAllPoints(int[][] points) {
        // 한 타임에 수평, 수직, 대각으로 이동할 수 있음.
        // 지점들은 반드시 순서대로 방문해야 함.
        // 마지막 지점은 지나칠 수 있음. 그러나 count에서는 증감되지 않음.
        Arrays.sort(points, (o1, o2) -> {
            return o1[0] - o2[0];
        });
        int counter = 0;
        // 기왕이면 대각으로 움직이는게 가장 효율적이다.
        int idx = 0;
        for(int i = 1; i< points.length; i++){
            System.out.println("points[i] = " + points[i][0] +", "+points[i][1]);
            int start_x = points[i - 1][0];
            int start_y = points[i - 1][1];
            int dest_x = points[i][0];
            int dest_y = points[i][1];
            //counter += 1;
            while(start_x < dest_x || start_y < dest_x){
                System.out.printf("start_x, start_y = %d, %d\n",start_x, start_y);
                System.out.printf("dest_x, dest_y = %d, %d\n",dest_x, dest_y);
                System.out.printf("counter =  %d\n",counter);
                counter += 1;
                if(start_x < dest_x && start_y < dest_y){
                    start_x += 1;
                    start_y += 1;
                    // counter += 1;
                    continue;
                }else if(start_x < dest_x){
                    start_x += 1;
                    //counter += 1;
                    continue;
                }else if(start_y < dest_y){
                    start_y += 1;
                    //counter += 1;
                    continue;
                }else if(start_x == dest_x && start_y == dest_y){
                    break;
                }
            }
        }
        return counter;
    }
}

/**
 *
 *  아래 정답 솔루션:
 */
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int totalTime = 0;
        int diff_x = 0;
        int diff_y = 0;

        for(int i = 1; i< points.length; i++){
            diff_x = Math.abs(points[i][0] - points[i - 1][0]);
            diff_y = Math.abs(points[i][1] - points[i - 1][1]);
            totalTime += (diff_x>=diff_y? diff_x:diff_y);
        }
        return totalTime;
    }
}

