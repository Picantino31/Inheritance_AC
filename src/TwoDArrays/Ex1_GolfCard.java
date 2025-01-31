package TwoDArrays;

public class Ex1_GolfCard {

    public static void run(){

        String[] names = { "Bob", "Serena", "Gill", "Steve"};
        int[][] scorecard = new int[4][18];

        System.out.println(scorecard.length);

        scorecard[0][0] = 4;
        scorecard[1][0] = 3;
        scorecard[2][0] = 5;
        scorecard[3][0] = 4;


        scorecard[0][1] = 3;
        scorecard[1][1] = 6;
        scorecard[2][1] = 1;
        scorecard[3][1] = 8;


        scorecard[0][2] = 4;
        scorecard[1][2] = 9;
        scorecard[2][2] = 1;
        scorecard[3][2] = 10;


        scorecard[0][3] = 4;
        scorecard[1][3] = 2;
        scorecard[2][3] = 1;
        scorecard[3][3] = 1;











        System.out.println("Scores                              Names");

        for (int row = 0; row < scorecard.length; row++) {
            int Total = 0;


            for (int col = 0; col < scorecard[row].length; col++) {
                System.out.print(scorecard[row][col] + " " );
                Total += scorecard[row][col];


            }
            System.out.print(names[row] + "  ");
            System.out.print(Total);
            System.out.println();
        }
        int Total1 = 0;
        for (int i = 0; i < scorecard.length  ; i++) {
            Total1 += scorecard[i][0];
        }

        System.out.println(Total1 / names.length);

    }//run


}//class