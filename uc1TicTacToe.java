public class uc1TicTacToe {

    // 3x3 board represented as a 2D character array
    static char[][] board = new char[3][3];

    // Initialize all cells with '-'
    static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    // Print the board to the console
    static void displayBoard() {
        System.out.println("  0 1 2");          // Column headers
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");           // Row header
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) System.out.print("|"); // Column separator
            }
            System.out.println();
            if (i < 2) System.out.println("  -----"); // Row separator
        }
    }

    public static void main(String[] args) {
        initializeBoard();   // Step 1: Initialize the board
        displayBoard();      // Step 2: Display the empty board
    }
}
