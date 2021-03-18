import java.util.Arrays;

public class Question1 {

    public Question1() {

    }

    public static void main(String[] args) {
        double[] array = {1.1, 3.4, 6.2, 3.1};
        Question1 question1 = new Question1();
        question1.biggestNumber(array);
    }

    public void biggestNumber(double[] array) {
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);
    }

}
