import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 {

    public static void main(String[] args) {
        averageOfAll();
    }

    /**
     * @description calculate the average of the numbers divided by 6
     */
    public static void averageOfAll() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        double sum = 0;
        for (int i = 1; i < 20000; i++) {
            if (i % 6 == 0) {
                arrayList.add(i);
            }
        }
        for (int i = 0; i < arrayList.size(); i++){
            sum =sum + arrayList.get(i);
        }
        System.out.println(sum/arrayList.size());
    }
}
