package Mid5_Palindromic_Number_Pyramid;

public class PalindromicNumberPyramid {
    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <= row; i++) {
            // Print leading spaces
            for (int j = row; j > i; j--) {
                System.out.print(" ");
            }
            // Print decreasing numbers
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            // Print increasing numbers
            for (int l = 2; l <= i; l++) {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
