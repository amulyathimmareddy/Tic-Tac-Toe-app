import java.util.Random;

public class uc7TicTacToe {

    // Simulating a partially filled board
    static char[][] board = {
        {'X', 'O', 'X'},
        {'O', '-', '-'},
        {'-', 'X', 'O'}
    };

    // Reusing Display Board logic
    static void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Reusing Valid Move logic
    static boolean isValidMove(int row, int col) {
        // Boundary checking and empty cell validation
        if (row < 0 || row > 2 || col < 0 || col > 2) return false;
        return board[row][col] == '-';
    }

    // Computer makes a random valid move
    static void computerMove() {
        Random random = new Random();
        boolean validMoveFound = false;

        System.out.println("Computer is thinking...");

        // Loop until a valid slot is found
        while (!validMoveFound) {
            // Generate a random slot between 1 and 9
            int slot = random.nextInt(9) + 1;
            
            // Convert slot to row and column indices
            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            // Validate move
            if (isValidMove(row, col)) {
                // Place the symbol (e.g., 'C' for Computer)
                board[row][col] = 'C'; 
                System.out.println("Computer successfully placed move at slot " + slot + " [Row: " + row + ", Col: " + col + "]");
                validMoveFound = true;
            } else {
                // Optionally print failed attempts (for debugging/demonstration)
                // System.out.println("Computer tried slot " + slot + ", but it's occupied. Retrying...");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Tic-Tac-Toe Computer Move System ---");
        
        System.out.println("\nInitial State:");
        displayBoard();

        System.out.println();
        computerMove();

        System.out.println("\nUpdated State:");
        displayBoard();
    }
}
