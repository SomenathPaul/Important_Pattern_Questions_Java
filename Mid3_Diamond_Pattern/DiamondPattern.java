package Mid3_Diamond_Pattern;

public class DiamondPattern {
    public static void main(String[] args) {
        int row = 5;
        // Upper half of the diamond
        for (int i = 1; i <= row; i++) {
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half of the diamond
        for (int i = row - 1; i >= 1; i--) {
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
