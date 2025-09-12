package Easy1_Solid_Rectangle;

class SolidRectangle {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 6;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}