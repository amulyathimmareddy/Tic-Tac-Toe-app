public class uc6TicTacToe {

    // Simulating an empty 3x3 board
    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    // Method to update the board with the given symbol
    static void placeMove(int row, int col, char symbol) {
        // Assume the move is already validated
        board[row][col] = symbol;
        System.out.println("Symbol '" + symbol + "' placed at [Row: " + row + "][Column: " + col + "]");
    }

    // Method to display the current state of the board
    static void displayBoard() {
        System.out.println("Current Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Tic-Tac-Toe Board Update System ---");
        
        System.out.println("\nInitial State:");
        displayBoard();

        System.out.println("\nPlayer 1 places 'X' at (1, 1):");
        placeMove(1, 1, 'X');
        
        System.out.println("\nPlayer 2 places 'O' at (0, 2):");
        placeMove(0, 2, 'O');

        System.out.println("\nUpdated State:");
        displayBoard();
    }
}
