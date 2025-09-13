package Hard4_Zig_Zag_Pattern_Three_Rows;

public class ZigZagPatternThreeRows {
    public static void main(String[] args) {
        int rows = 10;
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= rows; j++) {
                if (((i + j) % 4 == 0) || (i == 2 && j % 4 == 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
