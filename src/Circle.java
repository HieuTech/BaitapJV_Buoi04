import java.util.Scanner;

public class Circle {
    private int banKinh;
    private String color;
    private final float PI = 3.14f;
    public Circle() {

    }

    public Circle(int banKinh, String color) {
        this.banKinh = banKinh;
        this.color = color;
    }

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float chuViHinhTron(){
        float chuViHinhTron = 2*banKinh*this.PI;
        return chuViHinhTron;
    }

    public double dienTichHinhTron(){
        double dienTichHinhTron = this.PI*Math.pow(this.banKinh, 2);
        return dienTichHinhTron;
    }
    public void inputData(Scanner scanner){
        System.out.println("Xin mời nhập bán kính");
        this.banKinh = Integer.parseInt(scanner.nextLine());
        System.out.println("Xin mời nhập color");
        this.color = scanner.nextLine();
    }

    public void printData(){
        System.out.println("Ban kinh: " + this.banKinh);
        System.out.println("Mau sac: " + this.color);
    }

}
