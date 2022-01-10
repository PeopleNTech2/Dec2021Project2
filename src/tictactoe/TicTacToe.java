package tictactoe;

public class TicTacToe {
    public static void main(String[] args) {

        String [] board = new String[9];

        System.out.println(board[0]+"|"+board[1]+"|"+board[2]);
        System.out.println(board[3]+"|"+board[4]+"|"+board[5]);
        System.out.println(board[6]+"|"+board[7]+"|"+board[8]);

        System.out.println("player choose x or o");

        System.out.println("player 1 start playing");

        System.out.println("alternate player");

        //if 3 in row player wins
        //if player enters in non empty position - don't allow
        //if no more empty places - game is tied
        //ask if player wants to replay

        //don't accept incorrect position (correct position are [1 to 9] only)

    }
}
