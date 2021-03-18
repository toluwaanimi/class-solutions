public class Area {
    public static void main(String[] args) {
        Area area = new Area();
        double areaValue = area.calculate(50, 201);
        System.out.println("Area is: "+areaValue);



        //I created a static method to show you how the static method works within a class
        System.out.println("Area computed by the static method is: "+ calculateStatic(50, 201));
    }

    public double calculate(double length, double breath){
        return length* breath;
    }

    public static double calculateStatic(double length, double breath){
        return length* breath;
    }
}
