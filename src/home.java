import java.lang.reflect.Array;
import java.util.Arrays;

public class home {
    public static void main(String[] args) {
        double[] array = {8.2, 3.5, -2.1, -4.5, 2.0, 3.0, 6.0, -7.5, 1.8, 2.4, -1.6, 4.2, -3.7, 5.1, 7.3};
        boolean negative = false;
        double summa = 0;
        int count = 0;
        for (double i : array) {
            if (negative && i > 0) {
                summa += i;
                count++;
            }
            if (i < 0) {
                negative = true;
            }
        }
        double avg = summa / count;
        System.out.println("Среднее арифметическое "+avg);



    }
}
