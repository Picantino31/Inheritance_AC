package TwoDArrays;

public class Ex2_Tic {

    public static void run() {

        String[][] tictactoe = new String[3][3];

        setupBoard(tictactoe);
        // complete setupBoard function after printBoard
        // discuss Pass by Reference

        print2DString(tictactoe);
        System.out.println();

        tictactoe[0][1] = "X";
        tictactoe[0][0] = "X";
        tictactoe[0][2] = "O";
        tictactoe[1][1] = "X";
        tictactoe[1][2] = "O";
        tictactoe[2][1] = "X";


        print2DString(tictactoe);
        System.out.println();
        System.out.println("The winner is " + checkWinner(tictactoe));
        System.out.println();

    }// run

    public static String checkWinner(String[][] tictactoe) {
        //*** Only works for rows

        // use a for loop to check if a row is a winner
        for (int r = 0; r < tictactoe.length; r++) {
            if (!tictactoe[r][0].equals(" ") && tictactoe[r][0].equals(tictactoe[r][1]) && tictactoe[r][0].equals(tictactoe[r][2])) {
                return tictactoe[r][0] +  " in row " + r;
            }
        }

        for (int c = 0; c < tictactoe.length; c++) {
            if (!tictactoe[0][c].equals(" ") && tictactoe[0][c].equals(tictactoe[1][c]) && tictactoe[0][c].equals(tictactoe[2][c])) {
                return tictactoe[0][c] +  " in row " + c;
            }
        }



        return "no one yet!";
    }

    public static void print2DString(String[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                System.out.print("|" + arr[r][c] );
            }
            System.out.println("|");
        }

    }// print2dString

    public static void setupBoard(String[][] tictactoe) {
        for (int r = 0; r < tictactoe.length; r++) {
            for (int c = 0; c < tictactoe[r].length; c++) {
                tictactoe[r][c] = " ";
            }
        }
    }// end


}
