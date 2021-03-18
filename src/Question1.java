import java.util.Arrays;

public class Question1 {

    public Question1() {

    }

    public static void main(String[] args) {
        double[] array = {1.1, 3.4, 6.2, 3.1};
        Question1 question1 = new Question1();
        question1.biggestNumberBySorting(array);
    }

    public void biggestNumberUsingDotSort(double[] array) {
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);
    }

    public void biggestNumberBySorting(double[] array){
        double temp;
        for (int i =1; i < array.length; i++){
            for (int j = i; j > 0; j--){
                if (array[j] < array[j-1]){
                    temp = array[j];
                    array[j] = array[j -1];
                    array[j-1] = temp;
                }
            }
        }
        System.out.println(array[array.length - 1]);
    }

}
