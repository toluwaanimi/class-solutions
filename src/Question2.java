import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 {

    public static void main(String[] args) {
        double[] array = {1.1, 3.4, 6, 3.1};
        averageOfAll(array);
    }

    public static void averageOfAll(double[] array) {
        ArrayList<Double> arrayList = new ArrayList<>();
        double sum = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 6 == 0) {
                arrayList.add(array[i]);
            }
        }
        for (int i = 0; i < arrayList.size(); i++){
            sum =sum + arrayList.get(i);
        }
        System.out.println(sum);
    }
}
