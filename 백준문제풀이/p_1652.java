package 백준문제풀이.문자열;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class p_1652 {
    /**
     * 0707
     */
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        char[][] room = new char[n][n];
        for(int i = 0; i< n; i++){
            String row = br.readLine();
            for(int j = 0; j<n ; j++){
                room[i][j] = row.charAt(j);
            }
        }

        int row_cnt = 0;
        int col_cnt = 0;
        // 가로 체크하기
        for(int i = 0; i< n; i++){
            int count_row = 0;
            int count_col = 0;
            for(int j = 0; j< n; j++){
                if(room[i][j] == '.') count_row += 1;
                if(room[i][j] == 'X' || j == n - 1) {
                    if (count_row >= 2) row_cnt += 1;
                    count_row = 0;
                }
                if(room[j][i] == '.') count_col += 1;
                if(room[j][i] == 'X' || j == n - 1) {
                    if (count_col >= 2) col_cnt += 1;
                    count_col = 0;
                }
            }

        }

        System.out.printf("%d %d", row_cnt, col_cnt);
        bw.close();
        br.close();
    }
}
