import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        String fileName = "cit417test.txt";
        String line;
        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader =new BufferedReader(fileReader);
            while ((line =bufferedReader.readLine())!= null){
                System.out.println(line);
            }

        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("Unable to Open the file: "+fileName);
        } catch (IOException e) {
            System.out.println("Error in reading File: "+fileName);
        }

    }

}
