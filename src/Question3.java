import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Question3 {
    public static void main(String[] args) {
        String fileName = "cit417test.txt";
        try{
            FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("We are college of computing students. A privilege set of students \n");
            bufferedWriter.write("Praise God\n");
            bufferedWriter.write("We would surely graduate on time. Thank God for the opportunity\n");
            bufferedWriter.close();
        }catch (IOException e){
                System.out.println("Error writing to file: "+ fileName);
        }
    }
}
