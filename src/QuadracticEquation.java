public class QuadracticEquation {
    private double a;
    private double b;
    private double c;

    public QuadracticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void getDiscriminant(){
        double delta = Math.pow(this.b,2) - 4*this.a*this.c;
        if(delta > 0 ){
            System.out.printf("Nghiệm thứ nhất: %f \n", getRoot1(delta));
            System.out.printf("Nghiệm thứ hai: %f \n", getRoot2(delta));


        }else if ( delta == 0){
            System.out.printf("PT có 1 nghiệm duy nhất: %f \n", getRoot2(delta));
        }
        else{
            System.out.println("Phuong trinh vo nghiem");
        }

    }
    public double getRoot1(double delta){
        return (-b +Math.sqrt(delta)) / 2*a;
    }
    public  double getRoot2(double delta){
        return (-b -Math.sqrt(delta)) / 2*a;
    }
}
