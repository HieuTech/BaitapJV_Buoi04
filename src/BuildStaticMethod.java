public class BuildStaticMethod {

    private static final float PI = 3.14f;

    public static void calCircleArea(double R){
        double dienTich = PI*Math.pow(R,2);
        System.out.println("Dien tich hinh tron: "+ dienTich);
    }

    public static void calRectangleArea(double width, double height){
        double dienTich = width * height;
        System.out.println("Dien tich hinh Rectangle: "+ dienTich);

    }
    public static void calTriangleArea(double a, double b, double c){
        double dienTich = (a * b)/2;
        System.out.println("Dien tich hinh Triangle: " + dienTich);

    }
}
