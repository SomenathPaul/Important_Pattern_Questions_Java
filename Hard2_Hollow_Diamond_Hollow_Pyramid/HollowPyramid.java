package Hard2_Hollow_Diamond_Hollow_Pyramid;

public class HollowPyramid {
    public static void main(String[] args) {
        int rows = 5;
        // upper half
        for (int i = 1; i <= rows; i++) {
            // for space
            for (int space = rows; space > i; space--) {
                System.out.print(" ");
            }
            // for star
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // lower half
        for (int i = rows; i >= 1; i--) {
            // for space
            for (int space = rows; space > i; space--) {
                System.out.print(" ");
            }
            // for star
            for (int j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
