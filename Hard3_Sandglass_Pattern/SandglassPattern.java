package Hard3_Sandglass_Pattern;

public class SandglassPattern {
    public static void main(String[] args) {
        int rows = 4;
        // Upper half
        for (int i = 0; i < rows; i++) {
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * (rows - i); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // Lower half
        for (int i = rows - 1; i >= 0; i--) {
            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * (rows - i); star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}