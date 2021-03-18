//Creating a class called Area
public class Area {
    // the main method is key in a java class or program

    /**
     * @description  main method
     * @param args
     */
    public static void main(String[] args) {
        // Create an object of the class Area
        Area area = new Area();
        double areaValue = area.calculate(50, 201);
        System.out.println("Area is: "+areaValue);



        //I created a static method to show you how the static method works within a class
        System.out.println("Area computed by the static method is: "+ calculateStatic(50, 201));
    }

    /**
     * @description  this method handles the calculation of area.
     * @param length
     * @param breadth
     * @return
     */
    public double calculate(double length, double breadth){
        return 3.14 * length* breadth;
    }

    /**
     * @description this method is an example of static class in implementing the calculate function
     * @param length
     * @param breadth
     * @return
     */
    public static double calculateStatic(double length, double breadth){
        return 3.14* length* breadth;
    }
}
