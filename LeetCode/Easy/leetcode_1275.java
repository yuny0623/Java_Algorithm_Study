package Leetcode;

public class leetcode_1275 {
    public String tictactoe(int[][] moves) {
        // 0328

        // 3by3 에서 틱택토 게임이 진행됨.
        // A는 X를 둔다.
        // B는 O를 둔다.
        // 수직, 수평, 대각에 3개의 같은 char가 있을때 게임이 끝난다.
        // 또한 게임은 모든 보드가 채워지면 끝난다.
        // 누가 이기는지 리턴해라. (A,B) 비기면 Draw 를 리턴해라.
        // 아직 게임할 자리가 남아있으면 Pending 을 리턴해라. -> moves length 까지 돌았는데 보드 안채워져있           //으면 Pending 하라는 소리인듯.

        int[][] board = new int[3][3];
        int init = 100;
        for(int i = 0; i<3;i++){
            for(int j = 0; j<3; j++){
                board[i][j] = init;
                init += 1;
            }
        }
        boolean turn = true;  // true -> A
        for(int i = 0; i<moves.length; i++){
            if(turn){
                board[moves[i][0]][moves[i][1]] = 2;
                turn = false;
            }else{
                board[moves[i][0]][moves[i][1]] = 3;
                turn = true;
            }
            if(is_win(board)){ // 승자가 있다면 진행.
                if(turn){
                    return "B";
                }else{
                    return "A";
                }
            }
        }
        if(!is_filled(board)){ // 보드가 다 채워지지 않고 끝났다면;
            return "Pending";
        }else{ // 다 채워졌음에도 여기까지 왔다면 무승부
            return "Draw";
        }
    }

    public boolean is_win(int[][] board){ // 승자 있는지 판별
        for(int i = 0; i<3; i++){ // row check
            int[] row = board[i];
            if((row[0] == row[1]) && (row[1] == row[2])){
                return true;
            }
        }

        for(int i = 0; i< 3; i++){ // col check
            int[] col = new int[3];
            for(int j = 0; j<3; j++){
                col[j] = board[j][i];
            }
            if((col[0] == col[1]) && (col[1] == col[2])){
                return true;
            }
        }


        if((board[0][0] == board[1][1]) && (board[1][1] == board[2][2])){
            return true;
        }
        if((board[0][2] == board[1][1]) && (board[1][1] == board[2][0])){
            return true;
        }
        return false;
    }

    public boolean is_filled(int[][] board){
        for(int i = 0; i<3; i++){
            for(int j = 0; j<3; j++){
                if(board[i][j] >= 100){ // 채워지지 않은 곳이 있다면 false
                    return false;
                }
            }
        }
        return true;
    }
}
