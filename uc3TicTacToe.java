import java.util.Scanner;

public class uc3TicTacToe {

    // Accept user input for slot selection (1-9)
    static int getUserSlot() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a slot number (1-9): ");
        int slot = scanner.nextInt();
        return slot;
    }

    public static void main(String[] args) {
        System.out.println("--- Tic-Tac-Toe Input System ---");
        int selectedSlot = getUserSlot();
        System.out.println("You selected slot: " + selectedSlot);
    }
}
