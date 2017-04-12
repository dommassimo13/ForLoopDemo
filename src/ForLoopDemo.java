/**
 * Created by dominicmassimo on 4/12/17.
 */
public class ForLoopDemo {
    public static void main(String[] args) {


        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                int number = j + i * 10;
                if (number % 2 != 0)
                    System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}