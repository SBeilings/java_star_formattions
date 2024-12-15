public class Main {

    public static void main(String[] args) {

        int numOfStars = 5;
        int numOfRows = 5;

        // square block
        for (int j = 0; j < numOfRows; j++) {
            for (int i = 0; i < numOfStars; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // increasing triangle
        for (int j = 0; j < numOfRows; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //decreasing triangle
        for (int j = 0; j < numOfRows; j++) {
            for (int i = numOfStars; i > (j); i--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //right pascal triangle
        for (int j = 0; j < numOfRows; j++) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 0; j < numOfRows; j++) {
            for (int i = numOfStars; i > (j); i--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //right side triangle
        for (int i = 0; i < numOfRows; i++) {
            for (int k = numOfStars; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //left pascal triangle
        for (int i = 0; i < numOfRows; i++) {
            for (int k = numOfStars; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < numOfRows; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = numOfStars; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();


        //hill pattern
        for (int i = 0; i < numOfRows; i++) {
            for (int j = numOfStars; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //reverse hill
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = numOfStars; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //diamond
        for (int i = 0; i < numOfRows; i++) {
            for (int j = numOfStars; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = numOfStars; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
