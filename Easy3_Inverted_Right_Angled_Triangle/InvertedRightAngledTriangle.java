package Easy3_Inverted_Right_Angled_Triangle;

public class InvertedRightAngledTriangle {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = i; j <rows; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
