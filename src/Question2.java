import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question2 {

    public static void main(String[] args) {
        averageOfAll();
        simplerApproach();
    }

    /**
     * @description calculate the average of the numbers divided by 6
     */
    public static void averageOfAll() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        double sum = 0;
        for (int i = 1; i <= 20000; i++) {
            if (i % 6 == 0) {
                arrayList.add(i);
            }
        }
        for (int i = 0; i < arrayList.size(); i++){
            sum =sum + arrayList.get(i);
        }
        System.out.println(sum/arrayList.size());
    }

    public static void simplerApproach(){
        double sum = 0;
        int counter =0;
        for (int i =1; i <=20000; i++){
            if (i%6 == 0){
                sum += i;
                counter++;
            }
        }
        System.out.println("Average is :"+sum/counter);
    }
}
