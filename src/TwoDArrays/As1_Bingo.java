package TwoDArrays;
import java.util.Scanner;

public class As1_Bingo {

    public static Scanner input = new Scanner(System.in);
    public static char[] allLetters = {'B', 'I', 'N', 'G', 'O'};

    public static void run() {

        int[][] BingoNumbers = new int[5][5];

        BingoNumbers[0] = generateArray(5, 1, 15);
        BingoNumbers[1] = generateArray(5, 16, 30);
        BingoNumbers[2] = generateArray(5, 31, 45);
        BingoNumbers[3] = generateArray(5, 46, 60);
        BingoNumbers[4] = generateArray(5, 61, 75);


        for (int i = 0; i < 5; i++) {
            System.out.print(allLetters[i] + " ");
            for (int j = 0; j < 5; j++) {
                System.out.print(BingoNumbers[i][j] + " ");

            }
            System.out.println();
        }

        while (true) {



            input.nextLine();
            int num = (int) (Math.random() * (75 - 1 + 1) + 1);
            System.out.println("The number choosen is " + num);

            for (int i = 0; i < 5; i++) {
                System.out.print(allLetters[i] + " ");
                for (int j = 0; j < 5; j++) {
                    if (num == BingoNumbers[i][j]) {
                        BingoNumbers[i][j] *= -1;
                    }


                    System.out.print(BingoNumbers[i][j] + " ");

                }
                System.out.println();
            }



            for(int i=0; i<5; i++){
                if( !checkRow(BingoNumbers[i]) ){
                    System.out.println("Bingo!!");
                    System.exit(0);
                }
            }


            for(int i=0; i<5; i++){
                if( !checkCol(BingoNumbers, i)){
                System.out.println("Bingo!!");
                    System.exit(0);
            }
            }

        }
    }

    public static int[] generateArray(int arrLength, int minVal, int maxVal) {
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            int num = (int) (Math.random() * (maxVal - minVal + 1) + minVal);
            arr[i] = num;
        }
        return arr;
    }

    public static boolean checkRow(int[] row) {
        for (int i = 0; i < row.length; i++) {
            if (row[i] > 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkCol(int [][] Array, int colNum){
        for (int i = 0; i < Array.length; i++) {
            if (Array[i][colNum] > 0) {
                return true;
            }
        }
        return false;
    }





}
