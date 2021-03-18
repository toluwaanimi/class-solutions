import java.util.Scanner;

public class CallingClass {


   public static void main(String[] args) {
       double length;
       double height;
       double breadth;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the value for your breath: ");
       breadth = scanner.nextDouble();
       System.out.println("Enter the value for your length: ");
       length = scanner.nextDouble();
       System.out.println("Enter the value for your height: ");
       height = scanner.nextDouble();
       CalledClass calledClass = new CalledClass(length,breadth, height);
      double volume = calledClass.computeVolume();
      System.out.println("Volume is: "+ volume);
   }
}


class CalledClass{
    double length;
    double breadth;
    double height;

    /**
     * @description class constructor in initializing the variables passed to the class
     * @param length
     * @param breath
     * @param height
     */
    public CalledClass(double length, double breath, double height){
        this.breadth = breath;
        this.length = length;
        this.height =height;
    }

    /**
     * @description calculate the volume
     * @return double
     */
    public double computeVolume(){
        return breadth * height * breadth;
    }

}