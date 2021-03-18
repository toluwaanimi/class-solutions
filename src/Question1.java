import java.util.Arrays;

public class Question1 {

//    public Question1() {
//
//    }

    public static void main(String[] args) {
        //if you have the time you can decide to add 100 number sha, but me I no get time
        double[] array = {1.1, 3.4, 6.2, 3.1};
        Question1 question1 = new Question1();
        question1.biggestNumberBySorting(array);
    }

    /**
     * @description  using Arrays.sort to sort the array and print the largest number
     * @param array
     */
    public void biggestNumberUsingDotSort(double[] array) {
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);
    }

    /**
     * @description handles the sorting of array and prints the largest number in the array/
     * @param array
     */
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
        //Print the largest based on the last value in the array
        System.out.println(array[array.length - 1]);
    }

}
