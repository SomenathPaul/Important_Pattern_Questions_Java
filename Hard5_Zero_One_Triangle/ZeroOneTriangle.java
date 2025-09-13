package Hard5_Zero_One_Triangle;

public class ZeroOneTriangle {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            // if you want pyramid use this loop for spaces
            // for (int space = rows; space > i; space--) {
            //     System.out.print(" ");
            // }
            
            // for 0 and 1
            for (int j = 0; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
