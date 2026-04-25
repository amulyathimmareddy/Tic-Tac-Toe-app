public class uc5TicTacToe {
    
    // Simulating a board for validation
    static char[][] board = {
        {'-', 'X', '-'},
        {'O', '-', '-'},
        {'X', '-', 'O'}
    };

    // Method to validate if a move is valid
    static boolean isValidMove(int row, int col) {
        // 1. Boundary Checking: Ensure row and col are within bounds (0-2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid move: Coordinates out of bounds.");
            return false;
        }

        // 2. Empty Cell Check: Ensure the cell is empty ('-')
        if (board[row][col] != '-') {
            System.out.println("Invalid move: Cell [" + row + "][" + col + "] is already occupied.");
            return false;
        }

        System.out.println("Valid move: Cell [" + row + "][" + col + "] is accepted.");
        return true;
    }

    public static void main(String[] args) {
        System.out.println("--- Tic-Tac-Toe Validation System ---");
        
        // Testing some moves
        System.out.println("\nTesting move (0, 1):");
        isValidMove(0, 1); // Occupied by 'X'
        
        System.out.println("\nTesting move (1, 1):");
        isValidMove(1, 1); // Empty cell
        
        System.out.println("\nTesting move (3, 0):");
        isValidMove(3, 0); // Out of bounds
    }
}
