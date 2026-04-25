public class uc4TicTacToe {

    // Convert slot number (1-9) into zero-based row and column indices
    static void convertSlotToIndex(int slot) {
        if (slot < 1 || slot > 9) {
            System.out.println("Invalid slot. Must be between 1 and 9.");
            return;
        }

        // Zero-based index logic using Division and Modulo
        int row = (slot - 1) / 3;
        int col = (slot - 1) % 3;

        System.out.println("Slot " + slot + " -> Board Index [Row: " + row + "][Column: " + col + "]");
    }

    public static void main(String[] args) {
        System.out.println("--- Tic-Tac-Toe Index Conversion System ---");
        
        // Simulating the slot entered by user
        int[] testSlots = {1, 5, 9, 3, 7};
        
        for (int slot : testSlots) {
            convertSlotToIndex(slot);
        }
    }
}
