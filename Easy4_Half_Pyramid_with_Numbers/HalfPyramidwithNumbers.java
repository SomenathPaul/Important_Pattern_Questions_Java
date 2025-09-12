package Easy4_Half_Pyramid_with_Numbers;

public class HalfPyramidwithNumbers {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// if not run
// javac Easy4_Half_Pyramid_with_Numbers/HalfPyramidwithNumbers.java
// java Easy4_Half_Pyramid_with_Numbers/HalfPyramidwithNumbers.java