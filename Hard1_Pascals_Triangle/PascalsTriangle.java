package Hard1_Pascals_Triangle;

public class PascalsTriangle {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            int num = 1;
            // for space
            for (int space = 0; space < rows - i; space++) {
                System.out.print(" ");
            }
            // for numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}
