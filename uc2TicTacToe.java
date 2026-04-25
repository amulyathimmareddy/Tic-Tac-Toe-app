import java.util.Random;

public class uc2TicTacToe {
    static char playerSymbol;
    static char computerSymbol;
    static String currentPlayer;

    // Perform a toss to decide who plays first and assign symbols
    static void performToss() {
        Random random = new Random();
        int tossResult = random.nextInt(2); // Generates 0 or 1

        if (tossResult == 0) {
            System.out.println("User won the toss!");
            currentPlayer = "User";
            playerSymbol = 'X';
            computerSymbol = 'O';
        } else {
            System.out.println("Computer won the toss!");
            currentPlayer = "Computer";
            computerSymbol = 'X';
            playerSymbol = 'O';
        }

        System.out.println("User Symbol: " + playerSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
        System.out.println("First turn goes to: " + currentPlayer);
    }

    public static void main(String[] args) {
        System.out.println("--- Tic-Tac-Toe Toss System ---");
        performToss();
    }
}
